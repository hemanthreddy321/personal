package interview;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 70, 20};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max)
                max = num;
        }
        System.out.println("Max: " + max);
    }
}
