public class DRoot {

    public int digital_root(int n) {
        int res = 0;
        if (String.valueOf(n).length() > 1) {
            for (int i = 0; i < String.valueOf(n).length(); i++) {
                res += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            }
        }
        if (String.valueOf(res).length() == 1) {
            return res;
        }
        res = digital_root(res);
        return res;
    }

}
