package interview;

public class SwapStringStringBuilder {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World";

        StringBuilder sb = new StringBuilder(firstString);
        sb.append(secondString);

        secondString = sb.substring(0, firstString.length());
        firstString = sb.substring(secondString.length());

        System.out.println(firstString);
        System.out.println(secondString);
    }
}

