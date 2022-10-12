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

        // ===========Задача 5
        // Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
        // Заполнить ts1 15 случайными числами и вывести на печать.

        Comparator<Integer> comparatorSet = new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return ((t0 - t1) % 2 == 0) ? -1 : ((t0 - t1 % 2) != 0) ? 1 : 0;
            }
        };

        TreeSet<Integer> ts1 = new TreeSet<>(comparatorSet);
        for (int i = 0; i < 15; i++) {
            int numb = new Random().nextInt(30);
            ts1.add(numb);
        }
        System.out.println("TreeSet ts1 с компаратором");
        String s = "  ";
        ts1.forEach(n ->System.out.print(n + " ; "));
        System.out.println();

        // ===========Задача 6
        // *Объявить и инициализировать множество TreeMap tm с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
        // Заполнить tm 15 случайными числами и вывести на печать.

        Comparator<Integer> comparatorMap = new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return ((t0 - t1)%2==0)?-1:((t0 - t1)%2!=0)?1:0;
            }
        };

        TreeMap<Integer, Integer> tm = new TreeMap<>(comparatorMap);
        for (int i = 0; i < 15; i++) {
            int numb1 = new Random().nextInt(30);
            int numb2 = new Random().nextInt(30);

            tm.put(numb1, numb2);
        }
        System.out.println("TreeMap tm с компаратором");
        System.out.println(tm);

    }

}

