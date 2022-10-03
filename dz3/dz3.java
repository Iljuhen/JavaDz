package DZ.dz3;

import java.util.ArrayList;
import java.util.Collections;

public class dz3 {


    public static void main(String[] args) {

        System.out.println("=======Задача 1");
        // Создайте новый список массивов, добавить несколько цветов (строку) и
        // вывести коллекцию на экран.


        // Создаем Список массивов
        ArrayList<String> colorList = new ArrayList<>();

        // Добавляем элементы(цвета)
        colorList.add("blue");
        colorList.add("brown");
        colorList.add("rad");
        colorList.add(1, "yellow");
        System.out.println(colorList);
        System.out.println();

        System.out.println("=======Задача 2");
//          Проитерируйте все элементы списка цветов и добавте к каждому символа '!'.

        ArrayList<String> iterList = new ArrayList<>();
        for (int i = 0; i < colorList.size(); i++) {
            iterList.add(colorList.get(i) + "!");
        }
        System.out.println(iterList);
        System.out.println();

        System.out.println("=======Задача 3");
//        Напишите программу для вставки элемента в список массивов в первой позиции.
        colorList.add(0,"green");
        System.out.println("добавлен элемент green :\n"+colorList);
        System.out.println();
        System.out.println("=======Задача 4");
//        Извлеките элемент (по указанному индексу) из заданного списка.
        System.out.println("Элемент под индексом 2 : " + colorList.get(2));
        System.out.println();

        System.out.println("=======Задача 5");
//        Обновите элемент массива по заданному индексу.
        colorList.set(3,"black");
        System.out.println(colorList);
        System.out.println();
        System.out.println("=======Задача 6");
//        Напишите программу для удаления третьего элемента из списка массивов.
        System.out.println("Удаляем элемент : " + colorList.remove(3));
        System.out.println(" Измененный список : \n" + colorList);

        System.out.println("=======Задача 7");
//        Напишите программу для поиска элемента в списке массивов.
        String element = "rad";

        if (colorList.contains(element)) {
            System.out.println("Элемент --> " + "'"+element+"'"+ " присутствует в списке массивов!");
        } else {
            System.out.println("Элемента нет в списке массивов!");
        }
        System.out.println();

        System.out.println("=======Задача 8");
//        *Напишите программу для сортировки заданного списка массивов.

        System.out.println("До сортировки: "+colorList);
        Collections.sort(colorList);
        System.out.println("После сортировки: "+colorList);
        System.out.println();
        System.out.println("=======Задача 9");
//        *Напишите программу для копирования одного списка массивов в другой.
        colorList.addAll(iterList);

        System.out.println("Объединенный colorList :\n " + colorList);
    }
}