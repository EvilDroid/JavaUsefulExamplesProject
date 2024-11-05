package webReaderByBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebReaderByBufferedReader {
    public static void main(String[] args) throws IOException {

        URL oracle = new URL("https://www.oracle.com/index.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        StringBuilder page = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            page.append(inputLine);
        in.close();

        System.out.println(page);

    }
}
