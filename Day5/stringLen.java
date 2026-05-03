package Day5;

import java.util.Scanner;

public class stringLen {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if(s.length()<5)
            System.out.println("Short");
        else
            System.out.println("Long");
        sc.close();
    }
    
}
