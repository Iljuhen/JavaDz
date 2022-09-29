package DZ.dz2;

public class dz2task7 {
    // -----------Задача 7
    // Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "="
    // средствами String и StringBuilder.
    public static void main(String[] args) {
        long start1 = System.nanoTime();

        StringBuilder rep1 = new StringBuilder();
        
        for (int index = 0; index < 10000; index++) {
        rep1.append('=');
        }

        rep1 = rep1.replace(0, 10000, "равно");      
        long finish1 = System.nanoTime();
        long elapsed1 = finish1 - start1;
        

        long start2 = System.nanoTime();
        String rep2 = "=".repeat(10000);

        rep2 = rep2.replace("=", "равно");
        

        long finish2 = System.nanoTime();
        long elapsed2 = finish2 - start2;
        

        System.out.println("StringBuilder работал : " + elapsed1 + " (милисекунд)");
        System.out.println("String работал : " + elapsed2 + " (милисекунд)");

    }
}
