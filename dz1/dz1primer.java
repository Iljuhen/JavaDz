package DZ.dz1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class dz1primer {
    public static void main(String[] args) {
        
        // Создаем рандомное число
        Random random = new Random();
        int i = random.nextInt(2000)-1000;
        System.out.println(i);

        int n1 = (i & 0xff) >> 7;
        int n = i & 0x80;
        
        System.out.println(n1);
        System.out.println(n);

        for (int a = i; a < Short.MAX_VALUE; a++) {
            System.out.println(a);
            if(a%n==0){
            System.out.println(a);
            }
        }

// Создаем файл а ниже условие
    File file = new File("dz1/dz1.txt");
// Если файла не существует, тогда создаем
    if(!file.exists())
    {
        try {
            file.createNewFile();
    // Создаем исключение, чтоб если вылетит программа, знать почему.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // метод для записи в файл
    try {
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
        fileWriter.append("hello world");
        fileWriter.close();// или flash
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
