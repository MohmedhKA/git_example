package Day4;

import java.util.Scanner;

public class UserDataCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter username: ");
        String uname = sc.next();
        System.out.print("Enter age: ");
        byte age = sc.nextByte();
        System.out.print("Enter door number: ");
        int dnumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter address: ");
        String addr = sc.nextLine();
        System.out.print("Enter number: ");
        long pnumber = sc.nextLong();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        System.out.println("name: "+name+"\nusername: "+uname+"\nage: "+age+"\ndoor no: "+dnumber+
            "\nAddress: "+ addr+"\nPh number: "+pnumber+ "\nSalary: "+salary
        );
        sc.close();
    }
    
}
