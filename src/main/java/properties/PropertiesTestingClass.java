package properties;

import java.io.*;
import java.util.Properties;

public class PropertiesTestingClass {

    public static void main(String[] args) throws IOException {
        final String configPath = "src/main/resources/config.properties";
        Properties props = new Properties();
        props.load(new FileInputStream(configPath));


        //get property
        System.out.println("get property");

        String website = props.getProperty("website");
        System.out.println(website);

        String prop1 = props.getProperty("prop1");
        System.out.println(prop1);

        String prop2 = props.getProperty("prop2");
        System.out.println(prop2);


        String path = System.getProperty("user.home");
        System.out.println(path);


        //set property
        System.out.println("set property");

        int newKey1 = (int)(Math.random()*1000);
        props.setProperty("prop1",String.valueOf(newKey1)); //update
        props.store(new FileWriter(configPath), "store to properties file"); //store to file
        System.out.println(props.getProperty("prop1"));


        int newKey2 = (int)(Math.random()*1000);
        props.setProperty(String.valueOf(newKey2), String.valueOf(newKey2)); //add
        props.store(new FileWriter(configPath), "store to properties file"); //store to file
        System.out.println(props.getProperty(String.valueOf(newKey2)));


        //remove property
        System.out.println("remove property");

        int newKey3 = (int)(Math.random()*1000);
        props.setProperty(String.valueOf(newKey3), String.valueOf(newKey3)); //add
        props.store(new FileWriter(configPath), "store to properties file"); //store to file
        System.out.println(props.getProperty(String.valueOf(newKey3)));

        props.remove(String.valueOf(newKey3));
        props.store(new FileWriter(configPath), "store to properties file"); //store to file
        System.out.println(props.getProperty(String.valueOf(newKey3)));
    }
}
