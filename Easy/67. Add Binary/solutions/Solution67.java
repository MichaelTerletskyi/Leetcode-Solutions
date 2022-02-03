import java.math.BigInteger;

public class Solution67 {

//    Simple solution by BigInteger class
//    public String addBinary(String a, String b) {
//        return new BigInteger(a, 2).add( new BigInteger(b, 2)).toString(2);
//    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int aLength = a.length() - 1, bLength = b.length() - 1, temp = 0;
        while (aLength >= 0 || bLength >= 0) {
            int sum = temp;
            if (aLength >= 0) {
                sum += a.charAt(aLength--) - '0';
            }
            if (bLength >= 0) {
                sum += b.charAt(bLength--) - '0';
            }
            temp = sum / 2;
            res.insert(0, sum % 2);
        }

        if (temp == 1) {
            res.insert(0, '1');
        }
        return res.toString();
    }
}
