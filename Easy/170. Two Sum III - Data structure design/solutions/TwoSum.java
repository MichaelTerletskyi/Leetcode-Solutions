import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private Map<Integer, Integer> map = new HashMap<>();

    public void add(int number) {
        int count = map.getOrDefault(number, 0);
        map.put(number, count + 1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int y = value - num;
            if (y == num) {
                if (entry.getValue() >= 2) {
                    return true;
                }
            } else if (map.containsKey(y)) {
                return true;
            }
        }
        return false;
    }
}