package Day7;

import java.util.Scanner;

public class absr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("\t Welcome to the Bank\nEnter the Pin: ");
        int pin = sc.nextInt();
        if(pin == 2006){
            while (true) {
                System.out.println("1 - To Check Balance\n2 - To Deposit\n3 - To withdraw");
                System.out.print("Enter you choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + b.viewBalance());
                        break;
                    case 2:
                        System.out.print("Enter the amount: ");
                        double amount = sc.nextDouble();
                        b.setBalance(amount);
                        break;
                    case 3:
                        System.out.print("Enter the amount: ");
                        double amount1 = sc.nextDouble();
                        b.setBalance(-amount1);
                        break;
                    default:
                        System.err.println("Invalid Choice");
                        break;
                }
                sc.nextLine();
                System.out.print("Do you wanted to continue (y/n): ");
                char ch = sc.nextLine().charAt(0);
                if(ch == 'n'){
                    System.out.println("\t   Thank You");
                    break;
                }
            }
        }
        else
            System.out.println("incorrect Pin!!");

        sc.close();
        
    }
    
}

class Bank {
    private double balance = 0;

    double viewBalance(){
        return balance;
    }
    void setBalance(double amount){
        balance+=amount;
        System.out.println("Balance: "+viewBalance());
    }
}