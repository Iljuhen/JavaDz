package DZ.dz5;

import java.util.HashMap;
import java.util.Map;

;

public class dz5 {
    public static void main(String[] args) {

        // ===========Задача 1
        // Объявить и инициализировать словарь hashMap<String, String>

        System.out.println(ANSI_RED + "Задача 1" + ANSI_RESET);
        HashMap<String, String> hashmap = new HashMap<>();
        System.out.println("HashMap<String, String> hashmap = new HashMap<>();");
        
        // ===========Задача 2
        // Добавить в словарь 10 пар "Ключ - Значение". 
        // Автор и название книги например.
        System.out.println(ANSI_RED + "Задача 2" + ANSI_RESET);
        hashmap.put("sun", "Ilia");
        hashmap.put("daughter", "Yasya");
        hashmap.put("wife", "Kate");
        hashmap.put("cat", "Alice cat");
        hashmap.put("dog", "Vichy");
        hashmap.put("mother-in-law", "Masha");
        hashmap.put("father-in-law", "Kolja");
        hashmap.put("mum", "Olja");
        hashmap.put("dad", "Sergey");
        hashmap.put("sister", "Lida");
        hashmap.forEach((key, value) -> System.out.println(key + ", " + value + " ; "));

        // ===========Задача 3
        // Пройти по словарю и добавить к значениям символ "!"
        System.out.println(ANSI_RED + "Задача 3" + ANSI_RESET);

        for (Map.Entry entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "!");
        }

        // ===========Задача 4
        // Добавить нового автора и название книги если соответствующего ключа не было.
        System.out.println(ANSI_RED + "Задача 4" + ANSI_RESET);

        hashmap.putIfAbsent("bird", "Вася" + "----------> добавили, так как ключа не было");
        hashmap.forEach((key, value) -> System.out.println(key + ", " + value + " ; "));
        hashmap.remove("bird");

        // ===========Задача 5
        // Если ключ, указанный в запросе, имеется, вырезать из соответствующего
        // ключу значения первое слово.
        System.out.println(ANSI_RED + "Задача 5" + ANSI_RESET);

        if (hashmap.containsKey("cat") == true) {
            hashmap.replace("cat", "cat");
            hashmap.forEach((key, value) -> System.out.println(key + " ; " + value));
        }
        System.out.println();
        // ===========Задача 6
        // Если ключ, указанный в запросе, имеется, вырезать из соответствующего
        // ключу значения первое слово.
        System.out.println(ANSI_RED + "Задача 6" + ANSI_RESET);
        hashmap.forEach((key, value) -> System.out.println(key + "  --->  " + value + " ; "));

        // ===========Задача 7
        // * Пройти по словарю другим, не таким как в пункте 3 и 6, методом.
        // Добавить к значениям строку "(просмотрен)" и вывести в консоль.

        System.out.println(ANSI_RED + "Задача 7" + ANSI_RESET);
        for (String str : hashmap.keySet()) {
            hashmap.put(str, hashmap.get(str) + "  (просмотрен)\n");
        }
        System.out.print(hashmap);

    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[32m";


}
