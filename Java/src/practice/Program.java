package practice;

public class Program {
    public static void main(String[] args) {
        String name = "lol";
        String reverse = "";

        for ( int i=0; i<name.length(); i++) {
            reverse = name.charAt(i)+reverse;
        }
        System.out.println(reverse);
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println(("It is not a palindrome"));
        }
    }
}
