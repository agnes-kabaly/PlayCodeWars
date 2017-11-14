import java.math.BigInteger;

public class Factorial {

    // 4 kyu
    // Large Factorials
    public String factorial(int n) {
        if (n < 0) {
            return null;
        }
        BigInteger res = BigInteger.valueOf(1);
        for (long i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res.toString();
    }


}
