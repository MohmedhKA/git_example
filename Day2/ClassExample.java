package Day2;
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
        final int a1 =10;
        System.out.println(a1);
    }
}