package solveTheEquation;

public class SolveTheEquation {
    public static void main(String[] args) {
        String equation1 = "3 + 6 = ";
        System.out.println(solve(equation1));

        String equation2 = "3 - 6 = ";
        System.out.println(solve(equation2));

        String equation3 = "3 * 6 = ";
        System.out.println(solve(equation3));

    }

    public static String solve(String input){
        String result = "";
        String [] splitedInput = input.split(" ");
        int a = Integer.parseInt(splitedInput[0]);
        char expressionSymbol = splitedInput[1].charAt(0);
        int b = Integer.parseInt(splitedInput[2]);

        switch(expressionSymbol){
            case ('+'):
                result = String.valueOf(a + b);
                break;
            case ('-'):
                result = String.valueOf(a - b);
                break;
            case ('*'):
                result = String.valueOf(a * b);
                break;
            default:
                System.out.println("expressionSymbol incorrect");
                break;
        }

        return input.replace("\r\n", "") + result;
    }
}
