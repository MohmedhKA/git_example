package Day7;

import java.util.Scanner;

public class absr1 {
    public static void main(String[] args) {
        Innerabsr1 user = new Innerabsr1();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username: ");
            String str1 = sc.nextLine();
            System.out.print("Enter password: ");
            String str2 = sc.nextLine();

            if(user.check(str1, str2)){
                System.out.println("user Authenticated!");
                break;
            }
            else{
                System.out.print("username or password is not found\n(1) Do you wanted to continue | Reset password (2) | Enter anything to quit: ");
                int choice = sc.nextInt();
                sc.nextLine();
                if(choice == 1){
                    continue;
                }
                else if (choice == 2){
                    System.out.print("Enter username: ");
                    String u = sc.nextLine();
                    if(user.isThere(u)){
                        System.out.print("User Found!\nEnter New Password: ");
                        String newpass = sc.nextLine();
                        System.out.print("Enter new password again: ");
                        String agpas = sc.nextLine();
                        user.update(newpass, agpas);
                        
                    }
                    else{
                        System.out.println("username not found");
                    }
                }
                else{
                    break;
                }
            }
        }
        System.out.println("Congratulations!!");
        sc.close();
    }
}
class Innerabsr1 {
    private String name = "Mohmedh K A";
    private String passrd = "1234567890";

    boolean check(String lname, String pword){
        return (lname.equals(name) && pword.equals(passrd));
    }

    boolean isThere(String name){
        return (name.equals(this.name));
    }
    
    void update(String n, String o){
        if(n.equals(o)){
            passrd = n;
            System.out.println("Password changed!");
        }
        else{
            System.out.println("password mismatch ");
        }
    }
}
