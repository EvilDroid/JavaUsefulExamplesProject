package replaceAllPunctuationSymbolsFromString;

public class AllPunctuationSymbolsFromStringReplacer {
    public static void main(String[] args) {
        String str = "23. 567.567 4.5 .dfgh 56 dfg45. df.gg 77....,??:;{ } _ --  - /n";
        String res = replace(str);
        System.out.println(res);
    }

    public static String replace (String string){
        String result = "";
        result = string.replaceAll("\\p{Punct}","");
        return result;
    }
}
