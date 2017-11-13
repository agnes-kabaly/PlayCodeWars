import java.util.ArrayList;
import java.util.List;

public class Solution {

    // 5 kyu
    // Primes in numbers
    public String factors(int n) {
        List<Integer> factorialList = new ArrayList<>();
        String result = "";
        for (int factor = 2; factor*factor <= n; factor++) {
            while (n % factor == 0) {
                factorialList.add(factor);
                n = n / factor;
            }
        }
        System.out.println(factorialList);
        return result;
    }


}
