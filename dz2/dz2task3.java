package DZ.dz2;

public class dz2task3 {

    // -----------Задача 3
    // Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

    public static void main(String[] args) {

        String vers = "абвгдеёжз";
        System.out.println("дана строка : " + vers + "-->" + " " + "перевернутая строка : " + reverseString(vers));
    }

    public static String reverseString(String str) {

        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
