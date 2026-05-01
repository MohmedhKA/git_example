package Day5;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList T = new TodoList();

        System.out.print("Enter a Task: ");
        String s = sc.nextLine();
        T.addList(s);
        sc.close();

        
    }
}

class TodoList{
    void addList(String a){
        if(a.isBlank()||a.isEmpty()){
            System.out.println("It is Empty");
            return ;
        }
        System.out.println("Your task is: "+a);
    }
}
