package Day4;

public class StringsEg {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println("Length: "+ str.length());
        System.out.println("IsEmpty: "+ str.isEmpty());
        System.out.println("IsBlank: "+ str.isBlank());
        System.out.println("Is(\" \")Blank: "+ " ".isBlank());
        System.out.println("str.equals(\"Hello\"): " + str.equals("Hello") );
        System.out.println("str.equalsIgnoreCase('hello'): "+ str.equalsIgnoreCase("hello"));
        System.out.println("str.compareTo('Hello'): "+ str.compareTo("Hello"));
        System.out.println("str.compareTOIngoreCase('Hello'): "+ str.compareToIgnoreCase("Hello"));
        System.out.println("str.contains('aeiou'): "+ str.contains("a"));
        System.err.println(str.charAt(2));
        System.out.println(str.substring(3));
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("e", "a"));
        System.out.println(str.repeat(3));
        str = "   \u2000  HELLO  ";
        System.out.println(str.trim());
        System.err.println(str.strip());

    }
    
}
