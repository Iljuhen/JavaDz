package DZ.dz2;

public class dz2task4 {
    // -----------Задача 4
    // Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59; 3 – 56 = -53; 3 * 56 = 168;
    // Используем метод StringBuilder.append().

    public static void main(String[] args) 
    {

        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");
        StringBuilder str3 = new StringBuilder("");
        int num1 = 3;
        int num2 = 56;
        String plus = " + ";
        String equally = " = ";
        String minus = " - ";
        String mult = " * ";

        str1.append(num1);
        str1.append(plus);
        str1.append(num2);
        str1.append(equally);
        str1.append(num1 + num2);

        str2.append(num1);
        str2.append(minus);
        str2.append(num2);
        str2.append(equally);
        str2.append(num1 - num2);

        str3.append(num1);
        str3.append(mult);
        str3.append(num2);
        str3.append(equally);
        str3.append(num1 * num2);

        System.out.println("\r\n" + str1);
        System.out.println("\r\n" + str2);
        System.out.println("\r\n" + str3);
        System.out.println();

    }

}

