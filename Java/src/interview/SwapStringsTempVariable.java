package interview;

public class SwapStringsTempVariable {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "world";
        String temp;

        temp = string1;
        string1 = string2;
        string2 = temp;

        System.out.println(string1);
        System.out.println(string2);
    }
}
