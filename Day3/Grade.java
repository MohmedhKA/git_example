import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int mark = s.nextInt();
        if(mark >100){
            System.out.println("Get THe Hell OUT HERE!!");
        }
        else if(mark>99){
            System.out.println("O grade");
        }
        else if(mark >90){
            System.out.println("A grade");
        }
        else if(mark>70){
            System.out.println("B grade");
        }
        else if(mark>50){
            System.out.println("C grade");
        }
        else{
            System.out.println("YoU ArE FaIlUrE!!");
        }

        s.close();
    }
}
