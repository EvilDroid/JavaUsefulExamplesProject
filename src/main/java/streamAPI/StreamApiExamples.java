package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://javarush.com/en/groups/posts/en.2203.stream-api
 * https://javarush.com/quests/lectures/questsyntaxpro.level18.lecture03
 * https://javarush.com/quests/lectures/questsyntaxpro.level18.lecture04
 * https://javarush.com/quests/lectures/questsyntaxpro.level18.lecture05
 * https://javarush.com/quests/lectures/questsyntaxpro.level18.lecture06
 * 
 */

public class StreamApiExamples {
    public static void main(String[] args) {






        //------------------------------------Creating Stream
        //An instance of a stream cannot be used more than once

        //---------Empty stream:Stream.empty()
        Stream.empty();

        //---------Stream from List:list.stream()
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();

        //---------Stream from Map:map.entrySet().stream()
        HashMap <String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.entrySet().stream();

        //---------Stream from the array:Arrays.stream(array)
        int [] array = new int[] {1, 2 ,3};
        Arrays.stream(array);

        //---------Stream from the specified elements:Stream.of("1", "2", "3")
        //Создает поток из набора объектов
        Stream.of("1", "2", "3");







        //------------------------------------Intermediate Operators (methods of the Stream class)
        //Intermediate (also called “lazy”) - process incoming elements and return the stream. There can be many intermediate operators in the element processing chain.
        //There can be many intermediate operators called on one stream

        //---------filter
        //Фильтрует данные: пропускает только данные, которые соответствуют заданному правилу
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);

        //---------map
        //Преобразовывает данные из одного типа в другой
        //makes it possible to create a function with which we will change each element
        stream.map(x -> x + " - the length of the letters is three").forEach(x -> System.out.println(x));

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stream6 = stream.map((x) -> String.valueOf(x));

        Stream<Integer> stream7 = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stream8 = stream7.map(String::valueOf);
        Stream<Integer> stream9 = stream8.map(Integer::parseInt);

        //---------flatMap
        //Преобразовывает данные из одного типа в другой
        //as in the case with map, they are used to convert to a primitive stream.
        String[] array1 = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array1);
        streamOfArray.map(s->s.split("")) //Convert the word to an array of letters
                .flatMap(Arrays::stream).distinct() //aligns each generated thread into a single thread
                .collect(Collectors.toList()).forEach(System.out::println);

        //---------limit(long maxSize)
        // Обрезает данные после достижения лимита
        // limits the stream by the number of elements
        //Этот метод возвращает новый поток данных, который содержит только первые n данных из потока данных источника. Все остальные данные отбрасываются. Пример:
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 2, 2, 2, 3, 4);
        Stream<Integer> stream2 = stream.limit(3); // 1, 2, 3
        stream.limit(5).forEach(x -> System.out.println(x));

        //---------skip(long n)
        //Пропускает первые n данных
        //Этот метод возвращает новый поток данных, который содержит все те же данные, что и поток-источник, но пропускает (игнорирует) первые n данных. Пример:
        Stream<Integer> stream55 = Stream.of(1, 2, 3, 4, 5, 2, 2, 2, 3, 4);
        Stream<Integer> stream66 = stream55.skip(3); // 4, 5, 2, 2, 2, 3, 4
        // skip n elements:
        stream.skip(3).forEach(x -> System.out.println(x));

        //---------sorted(Comparator comparator)
        //Сортирует данные
        //Этот метод возвращает новый поток данных, который сортирует данные из потока-источника.
        // В качестве параметра можно передать компаратор, который будет задавать правила сравнения двух элементов потока данных.
        //sorts the stream
        stream.sorted().forEach(x -> System.out.println(x));

        //---------distinct
        //Удаляет дубликаты: не пропускает данные, которые уже были
        //Этот метод возвращает новый поток данных, который содержит только уникальные данные из потока данных источника. Все дублирующиеся данные отбрасываются. Пример:
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 2, 2, 2, 3, 4);
        Stream<Integer> stream4 = stream.distinct(); // 1, 2, 3, 4, 5


        //---------dropWhile(Predicate predicate)
        // skips elements that satisfy the condition

        //--------- Stream<T> generate()
        //Генерирует поток по заданному правилу
        //Метод Stream<T> Stream.generate(Supplier<T> obj)
        //Метод generate() позволяет задать правило, по которому будет генерироваться очередной элемент потока при его запросе. Например, можно каждый раз отдавать случайное число.
        //Пример:
        Stream<Double> s = Stream.generate(Math::random);

        //---------Stream<T> concat()
        //Объединяет вместе несколько потоков
        //Метод concat() объединяет два переданных потока в один. При чтении данных сначала будут прочитаны данные из первого потока, а затем из второго. Пример:
        Stream<Integer> stream1j = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2j = Stream.of(10, 11, 12, 13, 14);
        Stream<Integer> result = Stream.concat(stream1j, stream2j);

        //---------Stream<T> peek()
        //Выполняет действие над каждым данным
        //Этот метод возвращает новый поток данных, хотя данные в нем те же, что и в потоке источнике. Но когда запрашивается очередной элемент из потока, для него вызывается функция, которую вы передали в метод peek().
        //Если в метод peek() передать функцию System.out::println, тогда все объекты будут выводиться на экран в момент, когда они будут проходить через поток.





















        //------------------------------------Terminal  Operators (methods of the Stream class)
        //Terminal (“terminal”, also called “eager”) - process elements and terminate the stream, so there can only be one terminal operator in the chain.
        //There is only one terminal operator can be

        //---------forEach
        //returns nothing, analogue of for each (Consumer<T> performs some action on an object of type T, without returning anything);
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);

        //---------count()
        //Возвращает количество элементов в потоке данных
        //returns INT,  returns the number of stream elements:
        System.out.println(stream.count());

        //---------reduce(T identity, BinaryOperator accumulator) -
        // returns OBJECT, converts all elements of the stream into one object (calculate the sum of all elements, or find the minimum element), first take the object identityand the first element of the stream, apply the function accumulatorand identitybecome its result. Then everything continues for the remaining elements.
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x);// = 25

        //---------min(Comparator comparator) max(Comparator comparator)
        //Ищет минимальный элемент(обернутый в Optional<T>) в потоке данных
        // returns ELEMENT, searches for the minimum/maximum element based on the passed comparator;

        //---------Optional<T> max()
        //Возвращает максимальный элемент(обернутый в Optional<T>) в потоке данных

        //---------findFirst()
        //Возвращает первый найденный элемент(обернутый в Optional<T>), который соответствует правилу
        // returns ELEMENT wrapped by Optional, pulls out the first element of the stream:
        Stream.of(1, 2, 3, 4, 9).findFirst();

        ArrayList<String> list10 = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        Stream<String> stream10 = list10.stream();
        Optional<String> result10 = stream10.findFirst();
        String str = result10.get(); // Привет

        //---------Optional<T> findAny()
        //Возвращает любой элемент (обернутый в Optional<T>) из потока, который соответствует правилу

        //---------allMatch(Predicate predicate)
        //Проверяет, что все данные в потоке соответствуют заданному правилу
        // returns BOOLEAN, true if all elements of the stream satisfy the condition. If any element is encountered for which the result of calling the predicate function is false , then the operator stops scanning the elements and returns false :
        Stream.of(1, 2, 3, 4, 9).allMatch(x -> x <= 7);//false

        //---------anyMatch(Predicate predicate)
        //Проверяет, что среди данных потока есть хоть одно, которое соответствует заданному правилу
        // returns BOOLEAN, will return true if at least one element of the stream satisfies the condition predicate:
        Stream.of(1, 2, 3, 4, 9).anyMatch(x -> x >= 7);//true

        //---------noneMatch(Predicate predicate)
        //Проверяет, что никакие данные в потоке не соответствуют заданному правилу
        // returns BOOLEAN, will return true if, having gone through all the elements of the stream, none of them satisfied the condition predicate:
        Stream.of(1, 2, 3, 4, 9).noneMatch(x -> x >= 7);//false

        //---------collect(Collector)
        //Вычитывает все данные из потока и возвращает их в виде коллекции
        //returns LIST, method collects all elements into a list, set or other collection, groups elements according to some criterion, combines everything into a string, etc.:
        List<String> list1 = Stream.of("One", "Two", "Three").collect(Collectors.toList());

        //Collector Methods:

        //Collectors.toList()
        //returns LIST, collects elements into List:
        List<Integer> list2 = Stream.of(99, 2, 3).collect(Collectors.toList());

        //Collectors.toSet()
        //returns SET, collects elements into a set:
        Set<Integer> set = Stream.of(99, 2, 3).collect(Collectors.toSet());

        //toMap()
        //Объект, который преобразует поток в мэп — Map<K, V>
        //А вот преобразовать поток в мэп немного сложнее. Ведь каждый объект Map состоит из двух элементов — ключа и значения. Нам нужно придумать, как у элемента потока мы будем определять ключ, а как — значение.
        ArrayList<String> list11 = new ArrayList<String>();
        Collections.addAll(list11, "a=2", "b=3", "c=4", "d==3");

        Map<String, String> result11 = list11.stream()
                .map( e -> e.split("=") )
                .filter( e -> e.length == 2 )
                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );

        //Collectors.counting()
        //returns LONG, Counts the number of elements:
        Long count = Stream.of("1", "2", "3", "4").collect(Collectors.counting());

        //Collectors.joining()
        // returns STRING,
        String a = Stream.of("s", "u" ,"p", "e", "r").collect(Collectors.joining());
        System.out.println(a); // super

        String b = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining("-"));
        System.out.println(b); // s-u-p-e-r

        String c = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining(" -> ", "[ ", " ]"));
        System.out.println(c);  // [ s -> u -> p -> e -> r ]

        //mapping()
        //Преобразует элементы потока в Map<K, V>

        //groupingBy()
        //Группирует элементы, возвращает Map <K, V>

        //Collectors.summingInt() / Collectors.summingLong() / Collectors.summingDouble()
        // returns OBJECT,























        //------------------------------------Examples working with Stream

        //---------
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::print);

        //Example without thread:
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count1 = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count1++;
            if (count1 > 3) break;
            System.out.print(x);
        }

        //---------
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);

    }
}
