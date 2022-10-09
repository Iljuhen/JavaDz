package DZ.dz6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class dz6 {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int index = 0; index < 10; index++) {

            int r = new Random().nextInt(10);
            System.out.print(r + " ;");
            hs.add(r);
            lhs.add(r);
            ts.add(r);

        }
        System.out.println();
        hs.forEach(n -> System.out.print(n+ " ;"));
        System.out.println();
        lhs.forEach(n -> System.out.print(n+ " ;"));
        System.out.println();
        ts.forEach(n -> System.out.print(n+ " ;"));
        System.out.println();
    }
}
