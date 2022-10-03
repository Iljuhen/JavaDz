package DZ.dz2;

public class dz2task6 {
    // -----------Задача 6
    // Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.replace().
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("");
        int num1 = 3;
        int num2 = 56;
        String plus = " + ";
        String equally = " = ";

        str1.append(num1);
        str1.append(plus);
        str1.append(num2);
        str1.append(equally);
        str1.append(num1 + num2);
        StringBuilder tmp = str1.replace(7, 8, "равно");
        System.out.println(str1);
    }

}