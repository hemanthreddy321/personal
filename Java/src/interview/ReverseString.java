package interview;

public class ReverseString {

    public static String reverse(String input) {
        String reversedString = "";
        for (int i = 0; i< input.length(); i++) {
            reversedString = input.charAt(i)+reversedString;
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String input = "hemanth";
        String reversedString = reverse(input);
        System.out.println(reversedString);
    }
}
