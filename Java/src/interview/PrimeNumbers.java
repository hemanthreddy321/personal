package interview;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 29;  // Number used to check
        boolean isPrime = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + (isPrime ? " is prime" : " is not prime"));
    }
}
