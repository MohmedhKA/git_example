package Day4;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.err.println("Vowels");
        } else {
            System.out.println("Consonant");
        }
        sc.close();
    }

}
