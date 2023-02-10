package number;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {

    private int countPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        for (int i = 4; i <= n; i++) {
            // prime must be 6x - 1 or 6x + 1
            if (i > 10000 && i % 6 != 1 && i % 6 != 5) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 0; j < primes.size(); j++) {
                if (i % primes.get(j) == 0) {
                    isPrime = false;
                    break;
                }

                // only check c when c * c <= i
                if (i / primes.get(j) < primes.get(j)) {
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
        return primes.size();
    }
}
