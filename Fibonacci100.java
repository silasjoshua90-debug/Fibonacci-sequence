import java.math.BigInteger;

public class Fibonacci100 {
    public static void main(String[] args) {
        int count = 100;

        // Initialize the first two numbers of the sequence
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("The first " + count + " numbers of the Fibonacci sequence:");

        for (int i = 1; i <= count; i++) {
            System.out.println(i + ": " + first);

            // Calculate the next number and shift the values forward
            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}