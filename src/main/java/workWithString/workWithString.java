package workWithString;

public class workWithString {
    public static void main(String[] args) {

        String name = "Ivanov, Ivan";

        //cut substring before symbol
        int firstSymbolOfFirstName = name.indexOf(",");
        String ln = name.substring(0, firstSymbolOfFirstName);

        //cut substring after symbol
        int lastSymbolOfFirstName = name.indexOf(" ") + 1;
        String fn = name.substring(lastSymbolOfFirstName, name.length());

        //delete unnecessary symbols
        String fnu = "+38(050)123-45-67";
        fnu
                .replace("+", "")
                .replace("(", "")
                .replace(")", "")
                .replace("-", "");

    }
}
