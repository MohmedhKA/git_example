import java.util.Scanner;

public class eligable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println((age>=18)?"Eligible":"not Eligible");
        sc.close();
    }
    
}
