package DZ.dz2;

public class dz2task1 {

    public static void main(String[] args) 
    {

        // -----------Задача 1
        // Напишите программу на Java, чтобы найти наименьшее окно в строке, 
        // содержащей все символы другой строки.        

        String str1 = "Мороз и солнце - день чудесный!";
        String str2 = "и солнце";
        
        if (str1.length() > str2.length() && str1.contains(str2)) {
            System.out.println();
            System.out.println(
                    str1.contains(str2) + "-->" + "'" + str2 + "'" + "  " + "находится в" + "  " + "'" + str1 + "'\n");
        } else if (str1.length() < str2.length()) {
            System.out.println(str1.contains(str2) + "-->" + " " + str1 + " " + "str1" + " " + "<" + " " + "str2" +  " " + str2 + "\n");
        } else {
            System.out.println(str1.contains(str2) + "-->" + " " + "str2" + " " + " не входит в" + " " + "str1\n");
        }
    }
    
}         
    
    
