package practice;

public class Strings {
    public static void main(String[] args) {
        // String s = "Hello"; - String Literal
        // string class creates new object everytime in memory (String a = new String("hello");
        String original = "Hemanth";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        String name = "MADAM";
        String reverse = "";
        for (int i = 0; i < name.length() ; i++) {
            reverse = name.charAt(i) +reverse;
        }
        System.out.println(reverse);
        // equals - compapres the content of string
        // == - compares the reference of string objects
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println(("It is not a palindrome"));
        }
    }
}