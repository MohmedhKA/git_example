package Day6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(0,23);
        num.add(1);
        System.out.println(num);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println(num);
        num.set(0, 0);
        num.set(3,9);
        System.out.println(num);
        num.remove(1);
        System.out.println(num);
        System.out.println(num.contains(1));
        Collections.sort(num);
    }
    
}
