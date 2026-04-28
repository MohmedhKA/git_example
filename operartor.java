public class operartor {
    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        System.out.println("a+b        = "+ (a+b));
        System.out.println("a-b        = "+ (a-b));
        System.out.println("a*b        = "+ (a*b));
        System.out.println("a/b        = "+ (a/b));
        System.out.println("a/b        = "+ (a%b));

        System.out.println("a>>b       = "+ (a>>1));
        System.out.println("a<<b       = "+ (a<<1));

        System.out.println("a==b       = "+ (a==b));
        System.out.println("a!=b       = "+ (a!=b));
        System.out.println("a+=b       = "+ (a+=b));
        System.out.println("a-=b       = "+ (a-=b));

        System.out.println("a++        = "+ (a++));
        System.out.println("a--        = "+ (a--));
        System.out.println("--a        = "+ (--a));
        System.out.println("++a        = "+ (++a));

        System.out.println("a>b        = "+ (a>b));
        System.out.println("a<b        = "+ (a<b));
        System.out.println("a>=b       = "+ (a>=b));
        System.out.println("a<=b       = "+ (a<=b));

        System.out.println("a>=b       = "+ ((a>=b)?"yes":"boo"));

        System.out.println("\"a\"+(5+10) = "+"a"+(5+10));
        System.out.println("\"a\"+5+10   = "+"a"+5+10);

        System.out.println("a^b        = "+ (a^b));
        System.out.println("a&b        = "+ (a&b));
        System.out.println("a|b        = "+ (a|b));

        System.out.println("a<b && a>b = "+ (a<b && a>b));
        System.out.println("a<b || a>b = " +(a<b || a>b));
        System.out.println("!(a<b)     = "+ !(a<b));

        System.out.println("a          = "+a);
        System.out.println("a++        = "+ (a++) +"| ++a = " + (++a));
    }
    
}
