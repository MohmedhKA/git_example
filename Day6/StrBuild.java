package Day6;

public class StrBuild {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("AEIOU");
        s.append("aeiou");
        System.out.println(s);
        System.out.println(s.indexOf("EIO"));
        s.replace(0, 3, "ABC");
        System.out.println(s.toString());
        s.insert(0, "XZ");
        System.out.println(s.toString());
        System.out.println(s.reverse().toString());
        System.out.println(s.delete(0, 3).toString());
        System.out.println(s.capacity());
        System.out.println(s.charAt(5));


        StringBuffer sc = new StringBuffer();
        sc.append("ABCDE");
        sc.append("abcde");
        System.out.println(sc.toString());
        System.out.println(sc.indexOf("cde"));
    }    
}
