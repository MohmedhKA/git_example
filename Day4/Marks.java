package Day4;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        if(mark>=40) System.out.println("Pass");
        else System.out.println("Failure!");
        sc.close();
    }
    
}
