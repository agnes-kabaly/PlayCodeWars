import java.util.*;

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
        Set<Integer> factorialSet = new LinkedHashSet<>(factorialList);
        for (int each : factorialSet) {
            if (Collections.frequency(factorialList, each) > 1) {
                result += "(" + each + "**" + Collections.frequency(factorialList, each) + ")";
            } else {
                result += "(" + each + ")";
            }
        }
        if (n > 1) {
            result += "(" + n + ")";
        }
        return result;
    }


}
