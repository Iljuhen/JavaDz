package JavaDz.dz4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class dz4 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<Integer> age = new ArrayList<>();
            LinkedList<Integer> id = new LinkedList<>();
            ArrayList<String> name = new ArrayList<>();
            // int numm = scanner.nextInt();
            // String str = scanner.nextLine();
            boolean run = true;

            int count = 0;
            while (run) {
                System.out.println("Введите имя");
                name.add(scan.nextLine());

                System.out.println("Введите возраст");
                age.add(scan.nextInt());
                id.add(count);
                count++;
                System.out.println("Хотим ли мы продолжить??");
                scan.nextLine();
                if (scan.nextLine().toLowerCase().equals("n")) {
                    run = false;
                }

            }

            for (int index = 0; index < id.size(); index++) {

                System.out.print(name.get(id.get(index)) + ", ");
                System.out.print(age.get(id.get(index)) + ", ");
                System.out.println(id.get(index) + " ");

            }
            System.out.println("Сортируем по возрастанию");

            for (int index = 0; index < id.size(); index++) {
                Collections.sort(age);

                System.out.print(name.get(id.get(index)) + ", ");
                System.out.print(age.get(id.get(index)) + ", ");
                System.out.println(id.get(index) + " ");
            }
        }

    }
    // ArrayList<String> gender = new ArrayList<>();
}
