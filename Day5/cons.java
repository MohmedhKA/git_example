package Day5;

public class cons {
    public static void main(String[] args) {
        cons2 o = new cons2();
        cons2 o2 = new cons2("Sampath");
        cons2 o3 = new cons2(o);
        System.out.println(o.name);
        System.out.println(o2.name);
        System.out.println(o3.name);
    }
    
}
class cons2{
    String name;
    cons2(){
        name = "Sabari";
    }
    cons2(String s){
        name = s;
    }
    cons2(cons2 c){
        name = c.name;
    }
}