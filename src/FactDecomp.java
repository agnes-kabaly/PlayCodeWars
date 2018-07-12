import java.math.BigInteger;
import java.util.*;

public class FactDecomp {

    // 5 kyu
    // decompose n! into its prime factors.
    public String decomp(int n) {
        String result = "";
        List<BigInteger> factorList = new ArrayList<>();
        if (n < 0) {
            return null;
        }
        BigInteger factorOfNum = BigInteger.valueOf(1);
        for (long i = 1; i <= n; i++) {
            factorOfNum = factorOfNum.multiply(BigInteger.valueOf(i));
        }
        for (BigInteger bi2 = BigInteger.valueOf(2);
             (bi2.multiply(bi2)).compareTo(factorOfNum) <= 0;
                bi2 = bi2.add(BigInteger.valueOf(1))) {
            while (factorOfNum.mod(bi2).equals(BigInteger.valueOf(0))) {
                factorList.add(bi2);
                factorOfNum = factorOfNum.divide(bi2);
            }
        }
        factorList.add(factorOfNum);
        Set<BigInteger> factorialSet = new HashSet<>(factorList);
        for (BigInteger each : factorialSet) {
            if (Collections.frequency(factorList, each) > 1) {
                result += each + "^" + Collections.frequency(factorList, each) + " * ";
            } else {
                result += each + " * ";
            }
        }
        return result.substring(0, result.length()-3);
    }

}
