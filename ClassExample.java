public class ClassExample {
    public static void main(String[] args) {
        Example o = new Example();
        o.add();
        System.out.println(o.a);
        System.out.println(Example.b);
    }
}

class Example{
    int a = 10;
    static int b = 30;
    void add(){
        int a=50;
        System.out.println(a);
    }
}