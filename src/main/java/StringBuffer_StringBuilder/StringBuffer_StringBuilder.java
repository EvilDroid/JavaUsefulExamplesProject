package StringBuffer_StringBuilder;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        //StringBuffer синхронизированный и потокобезопасный.
        //То есть класс StringBuffer удобнее использовать в многопоточных приложениях, где объект данного класса может меняться в различных потоках.

        //StringBuilder, который не потокобезопасный, но при этом работает быстрее, чем StringBuffer в однопоточных приложениях.

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

        //Получение и установка символов
        //Метод charAt() получает, а метод setCharAt() устанавливает символ по определенному индексу:
//        StringBuffer strBuffer = new StringBuffer("Java");
//        char c = strBuffer.charAt(0); // J
//        System.out.println(c);
//        strBuffer.setCharAt(0, 'c');
//        System.out.println(strBuffer.toString()); // cava

        //Метод getChars() получает набор символов между определенными индексами:
//        StringBuffer strBuffer = new StringBuffer("world");
//        int startIndex = 1;
//        int endIndex = 4;
//        char[] buffer = new char[endIndex-startIndex];
//        strBuffer.getChars(startIndex, endIndex, buffer, 0);
//        System.out.println(buffer); // orl

        //Добавление в строку
        //Метод append() добавляет подстроку в конец StringBuffer:
//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.append(" world");
//        System.out.println(strBuffer.toString()); // hello world

        //Метод insert() добавляет строку или символ по определенному индексу в StringBuffer:
//        StringBuffer strBuffer = new StringBuffer("word");
//
//        strBuffer.insert(3, 'l');
//        System.out.println(strBuffer.toString()); //world
//
//        strBuffer.insert(0, "s");
//        System.out.println(strBuffer.toString()); //sworld

        //Удаление символов
        //Метод delete() удаляет все символы с определенного индекса о определенной позиции, а метод deleteCharAt() удаляет один символ по определенному индексу:
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.delete(0,2);
//        System.out.println(strBuffer.toString()); //sembler
//
//        strBuffer.deleteCharAt(6);
//        System.out.println(strBuffer.toString()); //semble

        //Обрезка строки
        //Метод substring() обрезает строку с определенного индекса до конца, либо до определенного индекса:
//        StringBuffer strBuffer = new StringBuffer("hello java!");
//        String str1 = strBuffer.substring(6); // обрезка строки с 6 символа до конца
//        System.out.println(str1); //java!
//
//        String str2 = strBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
//        System.out.println(str2); //lo jav

        //Изменение длины
        //Для изменения длины StringBuffer (не емкости буфера символов) применяется метод setLength(). Если StringBuffer
        // увеличивается, то его строка просто дополняется в конце пустыми символами, если уменьшается - то строка по сути обрезается:
//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.setLength(10);
//        System.out.println(strBuffer.toString()); //"hello     "
//
//        strBuffer.setLength(4);
//        System.out.println(strBuffer.toString()); //"hell"

        //Замена в строке
        //Для замены подстроки между определенными позициями в StringBuffer на другую подстроку применяется метод replace():
        //Первый параметр метода replace указывает, с какой позиции надо начать замену, второй параметр - до какой позиции,
        // а третий параметр указывает на подстроку замены.
//        StringBuffer strBuffer = new StringBuffer("hello world!");
//        strBuffer.replace(6,11,"java");
//        System.out.println(strBuffer.toString()); //hello java!

        //Обратный порядок в строке
        //Метод reverse() меняет порядок в StringBuffer на обратный:
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.reverse();
//        System.out.println(strBuffer.toString()); //relbmessa

    }
}
