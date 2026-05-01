package Day5;

import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tracker t = new Tracker();

        System.out.print("Enter the product name: ");
        String name = sc.nextLine();
        double price;

        while(!(name.equals("0"))){
            System.out.print("Enter the product price: ");
            price = sc.nextDouble();
            t.adder(price);
            sc.nextLine();
            System.out.print("Enter the product name: ");
            name = sc.nextLine();
        }

        System.out.println("you total expense is: "+Tracker.total);
        sc.close();
    }
}

class Tracker{
    static double total=0;

    void adder(double cost){
        total += cost;
    }

}
