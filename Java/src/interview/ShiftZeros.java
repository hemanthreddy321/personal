package interview;

import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 3, 0, 0, 0};
        int position = 0;

        // Step 1: Move non-zeros to the front
        for (int num : a) {
            if (num != 0) {
                a[position++] = num;
            }
        }

        // Step 2: Fill the remaining spots with zeros
        while (position < a.length) {
            a[position++] = 0;
        }

        System.out.println(Arrays.toString(a));
    }
}
