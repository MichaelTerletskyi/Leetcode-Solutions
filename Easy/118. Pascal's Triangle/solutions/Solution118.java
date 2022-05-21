import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {

//    Nice Solution by multidimensional arrays
//    public List<List<Integer>> generate(int numRows) {
//        int[][] pascal = new int[numRows][];
//        for (int i = 0; i < numRows; i++){
//            int[] row = new int[i + 1];
//            row[0] = 1;
//            row[i] = 1;
//            for (int j = 1; j < i; j++){
//                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
//            }
//            pascal[i] = row;
//        }
//        return (List) Arrays.asList(pascal);
//    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> integers = new ArrayList<>();
            if (i - 1 >= 1) {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0 || j == i) {
                        integers.add(1);
                    } else {
                        List<Integer> tempIntegers = lists.get(i - 1);
                        integers.add(tempIntegers.get(j - 1) + tempIntegers.get(j));
                    }
                }
            } else {
                for (int n = 0; n < i + 1; n++) {
                    integers.add(1);
                }
            }
            lists.add(integers);
        }
        return lists;
    }
}