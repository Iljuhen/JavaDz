package DZ.dz6;

import java.util.*;

public class dz6 {

    public static void main(String[] args) {
        // ===========Задача 1
        // Объявить и инициализировать словарь hashMap<String, String>
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.println(" Значения из которых собирутся сеты:");
        System.out.println("для hs");

        // ===========Задача 2
        // Добавить в множества по 10 случайных целочисленных ключей.
        for (int index = 0; index < 10; index++) {

            int r = new Random().nextInt(10);
            System.out.print(r + " ;");
            hs.add(r);

        }
        System.out.println();

        System.out.println("для lhs");

        for (int index = 0; index < 10; index++) {

            int r = new Random().nextInt(10);
            System.out.print(r + " ;");

            lhs.add(r);

        }
        System.out.println();

        System.out.println("для ts");

        for (int index = 0; index < 10; index++) {

            int r = new Random().nextInt(10);
            System.out.print(r + " ;");


            ts.add(r);
        }


        System.out.println();
        System.out.println("собранный hs");
        hs.forEach(n -> System.out.print(n + " ;"));
        System.out.println();
        System.out.println("собранный lhs");
        lhs.forEach(n -> System.out.print(n + " ;"));
        System.out.println();
        System.out.println("собранный ts");
        ts.forEach(n -> System.out.print(n + " ;"));
        System.out.println();

        // ===========Задача 3
        // Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs.
        for (int iLhs : lhs) {
            hs.remove(iLhs);
        }
        System.out.println("удалены значения lhs из hs");
        hs.forEach(n -> System.out.print(n + " ;"));


        System.out.println();


        // ===========Задача 4
        // Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавить ключ в ts.
        ts.addAll(lhs);


        System.out.println("добавлены значения из lhs в ts");
        ts.forEach(n -> System.out.print(n + " ;"));


        System.out.println();

    }

}


//package DZ.dz6;
//
//import java.util.*;
//
//public class dz6 {
//
//    public static void main(String[] args) {
//
//        // ===========Задача 1
//        // Объявить и инициализировать словарь hashMap<String, String>
//
//        HashSet<Integer> hs = new HashSet<>();
//        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
//        TreeSet<Integer> ts = new TreeSet<>();
//
//        // ===========Задача 2
//        // Добавить в множества по 10 случайных целочисленных ключей.
//        System.out.println("Создание множества для hs");
//        for (int index = 0; index < 10; index++) {
//
//            int r = new Random().nextInt(20);
//            System.out.print(r + " ;");
//            hs.add(r);
//
//
//        }
//        System.out.println();
//        System.out.println("Создание множества для lhs");
//        for (int index = 0; index < 10; index++) {
//
//            int r = new Random().nextInt(20);
//            System.out.print(r + " ;");
//            lhs.add(r);
//
//
//        }
//        System.out.println();
//        System.out.println("Создание множества для ts");
//        for (int index = 0; index < 10; index++) {
//
//            int r = new Random().nextInt(20);
//            System.out.print(r + " ;");
//            ts.add(r);
//
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("Полученный hs");
//        hs.forEach(n -> System.out.print(n + " ;"));
//        System.out.println();
//        System.out.println("Полученный lhs");
//        lhs.forEach(n -> System.out.print(n + " ;"));
//        System.out.println();
//        System.out.println("Полученный ts");
//        ts.forEach(n -> System.out.print(n + " ;"));
//        System.out.println();
//
//        // ===========Задача 3
//        // Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs.
//        Iterator<Integer> hsIt = hs.iterator();
//        Iterator<Integer> lhsIt = lhs.iterator();
//        for (int i = 0; i <hsIt.hasNext() ; hsIt.next()) {
//
//                if(hsIt.hasNext()== lhsIt.hasNext()) {
//                hs.remove(hsIt.next());
//            }
//        }
//        System.out.println();
//        hs.forEach(n -> System.out.print(n + " ;"));
//        System.out.println();
//        lhs.forEach(n -> System.out.print(n + " ;"));
//        System.out.println();

//        if (hashmap.containsKey("cat") == true) {
//            hashmap.replace("cat", "cat");
//            hashmap.forEach((key, value) -> System.out.println(key + " ; " + value));
//        }
//        for (String str : hashmap.keySet()) {
//            hashmap.put(str, hashmap.get(str) + "  (просмотрен)\n");
//        }

// ===========Задача 4
// Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts.
//        System.out.println(ANSI_RED + "Задача 4" + ANSI_RESET);
//        System.out.print("keys :");
//        for (int i = 0; i < lhs.size(); lhs.hasNext()) {
//            if (lhs.contains(i) != ts.contains(i)) ;
//            System.out.print(i);
//            ts.add(i);
//        }
//        System.out.println();
//        lhs.forEach(n -> System.out.print(n + " ;"));
//        System.out.println();
//        ts.forEach(n -> System.out.print(n + " ;"));
// ===========Задача 5
// Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
// Заполнить ts1 15 случайными числами и вывести на печать.

// ===========Задача 6
// *Объявить и инициализировать множество TreeMap tm с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
// Заполнить tm 15 случайными числами и вывести на печать.


//    }
//
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_RESET = "\u001B[37m";
//}
