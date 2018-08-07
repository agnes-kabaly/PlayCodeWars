import java.util.ArrayList;
import java.util.List;

public class KataCoin {

    public String[] coin(int n) {
        List<String> resultList = new ArrayList<>();
        List<String> finalResult = new ArrayList<>();
        if (n == 1) {
            resultList.add("H");
            resultList.add("T");
            return resultList.toArray(new String[resultList.size()]);
        }
        String[] combos = coin(n - 1);
        for (String combo : combos) {
            finalResult.add(combo + "H");
            finalResult.add(combo + "T");
        }

        String[] result = finalResult.toArray(new String[finalResult.size()]);

        /*for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }*/

        return result;
    }

}
