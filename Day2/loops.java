package Day2;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        // do{
        //     n = sc.nextInt();
        //     System.out.println(n);
        // }while(n!=0);
        // sc.close();
        n = sc.nextInt();
        while(n!=0){
            System.out.println(n);
            n = sc.nextInt();
        }
        sc.close();
    }
}
