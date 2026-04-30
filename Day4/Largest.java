package Day4;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        if(n>m) System.out.println("n is largest");
        else if (n<m) System.out.println("m is largest");
        else System.out.println("n and m are equal");
    }
    
}
