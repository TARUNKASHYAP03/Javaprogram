import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean isPrime(int num, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrime(num, divisor - 1);
    }

    void generatePrimes(int n, int current, List<Integer> primes) {
        if (current > n) {
            return;
        }
        if (isPrime(current, current / 2)) {
            primes.add(current);
        }
        generatePrimes(n, current + 1, primes);
    }

    List<Integer> primesBetween1ToN(int n) {
        List<Integer> primes = new ArrayList<>();
        generatePrimes(n, 2, primes);
        return primes;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        Solution solution = new Solution();
        List<Integer> primes = solution.primesBetween1ToN(n);
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < primes.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(primes.get(i));
        }
        sb.append("]");

        System.out.println(sb.toString());
    }
}
