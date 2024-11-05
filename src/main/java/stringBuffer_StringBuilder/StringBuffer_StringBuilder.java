package stringBuffer_StringBuilder;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        //StringBuffer synchronized threadsafe
        //StringBuffer useful in multithread

        //StringBuilder faster then StringBuffer but not threadsafe

        //Constructors:
//        StringBuffer()
//        StringBuffer(int capacity)
//        StringBuffer(String str)
//        StringBuffer(CharSequence chars)

        //ensureCapacity
        //strBuffer.ensureCapacity(32);

        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println(strBuffer.toString()); // Java

        //Get and set symbol
        //Method charAt() get symbol by index, а Method setCharAt() set symbol by index
//        StringBuffer strBuffer = new StringBuffer("Java");
//        char c = strBuffer.charAt(0); // J
//        System.out.println(c);
//        strBuffer.setCharAt(0, 'c');
//        System.out.println(strBuffer.toString()); // cava

        //Method getChars() between indexes
//        StringBuffer strBuffer = new StringBuffer("world");
//        int startIndex = 1;
//        int endIndex = 4;
//        char[] buffer = new char[endIndex-startIndex];
//        strBuffer.getChars(startIndex, endIndex, buffer, 0);
//        System.out.println(buffer); // orl

        //Add in string
        //Method append() add string to end
//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.append(" world");
//        System.out.println(strBuffer.toString()); // hello world

        //Method insert() add string or symbol by index
//        StringBuffer strBuffer = new StringBuffer("word");
//
//        strBuffer.insert(3, 'l');
//        System.out.println(strBuffer.toString()); //world
//
//        strBuffer.insert(0, "s");
//        System.out.println(strBuffer.toString()); //sworld

        //Delete symbol
        //Method delete() del all symbols between positions.  Method deleteCharAt() delete 1 symbol by index:
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.delete(0,2);
//        System.out.println(strBuffer.toString()); //sembler
//
//        strBuffer.deleteCharAt(6);
//        System.out.println(strBuffer.toString()); //semble

        //Cut string
        //method substring() from index to end or to another index
//        StringBuffer strBuffer = new StringBuffer("hello java!");
//        String str1 = strBuffer.substring(6); // обрезка строки с 6 символа до конца
//        System.out.println(str1); //java!
//
//        String str2 = strBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
//        System.out.println(str2); //lo jav

        //Change length (capacity)
        //Method setLength()
//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.setLength(10);
//        System.out.println(strBuffer.toString()); //"hello     "
//
//        strBuffer.setLength(4);
//        System.out.println(strBuffer.toString()); //"hell"

        //Exchange in string
        //change substring between exact positions to another - method replace():
//        StringBuffer strBuffer = new StringBuffer("hello world!");
//        strBuffer.replace(6,11,"java");
//        System.out.println(strBuffer.toString()); //hello java!

        //Reverse string
        //method reverse()
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.reverse();
//        System.out.println(strBuffer.toString()); //relbmessa

    }
}
