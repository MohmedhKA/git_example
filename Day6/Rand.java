package Day6;

import java.util.Arrays;
import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println(n+1);

        boolean bol = rand.nextBoolean();
        System.out.println(bol);

        double dob = rand.nextDouble(50);
        System.out.println(dob);

        double dob1 = rand.nextGaussian();
        System.out.println(10+ (2*dob1));

        byte b[] = new byte[10];
        rand.nextBytes(b);
        System.out.println(Arrays.toString(b));


    }
}
