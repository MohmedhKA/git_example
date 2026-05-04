package Day7;

public class mathFunctions {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 4;

        double db1 = 5.6;
        double db2 = 2.1;

        //Round
        System.out.println("abs: "+Math.abs(-num2));

        //Min and Max
        System.out.println("Max: "+Math.max(num1, num2));
        System.out.println("Min: "+Math.min(num1, num2));

        //Pow
        System.out.println("Pow: "+Math.pow(num1, 3));

        //Root
        System.out.println("Sqrt: "+Math.sqrt(num1));
        System.out.println("Cbrt: "+Math.cbrt(num1+4));

        //Ceil
        System.out.println("Ceil: "+Math.ceil(db1));

        //Floor
        System.out.println("Floor: "+Math.floor(db2));

        //Round
        System.out.println("Round: "+Math.round(db2));

        //Functions
        double degree = db1 + db2;
        System.out.println("degree : "+degree);
        double radian = Math.toRadians(degree);
        System.out.println(radian);
        System.out.println("Cos: "+Math.cos(radian));
        System.out.println("Tan: "+Math.tan(radian));
        System.out.println("Sin: "+Math.sin(radian));
    }
    
}
