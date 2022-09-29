package DZ.dz1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class dz1 {
    
    public static void main(String[] args) 
    {
       
        int i = getRandNumb(); 
        String binn = binNum(i);
        int n = maxBit(i);
        System.out.println("Выпавшее рандомное число :\n" + i);
        System.out.println("В двоичном представлении :\n" + binn);
        System.out.println("Местонахождение максимального бита :\n" + n);
        Integer[] m1 = getArrayMax(i, n);
        Integer[] m2 = getArrayMin(i, n);

        writeToFile(m1,"m1");
        writeToFile(m2, "m2");
        System.out.println("Файлы с массивамисохранены");
    }    
    
    // Создаем рандомное число
    static int getRandNumb()
    {
        Random random = new Random();
        int i = random.nextInt(2001)-1000;
        
        // System.out.println(i);
        // System.out.println(Integer.toBinaryString(i));
        return i;
    }

    // переводим рандомное число в двоичную систему
    static String binNum(int i) 
    {
        String iSec =  String.format("%32s",Integer.toBinaryString(i)).replace(' ', '0');
                
        // Перевод из строки в инт
        // int binNum = Integer.parseInt(iSec.trim());
        
        return (iSec);
    }

    // Поиск максимального бита
    static int maxBit(int i) 
    {
        // Перевод числа в абсолютное (убираем знак минус если есть)
        int iSec2 =  Math.abs(i);
        // System.out.println(iSec2);

        // // Перевод строки в двоичную систему
        // System.out.println(Integer.toBinaryString(iSec2));

        // // Переводит строки в двоичную систему  
        // // и считает длинну строки, что и яляется нахождением максимального бита
        // System.out.println(Integer.toBinaryString(iSec2).length());
                       
        return (Integer.toBinaryString(iSec2).length());
    }
       
    // Создаем массив для Short.max_value
    static Integer[] getArrayMax(int nummI, int nummN) 
    {
        ArrayList<Integer> m1 = new ArrayList<>();
        for (int i = nummI; i <= Short.MAX_VALUE ; i++) {
            if (i % nummN == 0) {
                m1.add(i);
            }
        }
        Integer[] array = new Integer[m1.size()];
        m1.toArray(array);
        return array;
    }
    
    // Создаем массив для Short.min_value
    static Integer[] getArrayMin(int nummI, int nummN) 
    {
        ArrayList<Integer> m2 = new ArrayList<>();
        for (int i = nummI; i >= Short.MIN_VALUE; i--) {
            if (i % nummN != 0) {
                m2.add(i);
            }
        }
        Integer[] array = new Integer[m2.size()];
        m2.toArray(array);
        return array;
    }

    // Вывод на печать массива
    public static void printArray(Integer[] array) 
    {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i < array.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    // Запись в файл массива
    static void writeToFile(Integer[] array, String name) 
    {
        try (FileWriter fw = new FileWriter(name + ".txt", false)) 
        {
            fw.write("[");
            for (int i = 0; i < array.length; i++) 
            {
                fw.append(array[i].toString());
                if (i < array.length - 1) {
                    fw.append(", ");
                }
            }
            fw.write("]");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }  

}