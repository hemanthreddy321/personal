package interview;

public class SwapStrings {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "world";

        // Step 1: Combine both: "helloworld"
        string1 = string1 + string2;

        // Step 2: Extract original string1 into string2:
        // length("helloworld") - length("world") = 10 - 5 = 5  -> "hello"
        string2 = string1.substring(0, string1.length() - string2.length());

        // Step 3: Extract original string2 into string1:
        // substring from index length("hello") = 5 -> "world"
        string1 = string1.substring(string2.length());

        System.out.println(string1); // world
        System.out.println(string2); // hello
    }
}

