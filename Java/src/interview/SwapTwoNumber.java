package interview;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b; //30
        b = a - b; //10
        a = a - b; // a = 30-10 = 20

        System.out.println(a);
        System.out.println(b);
    }
}
