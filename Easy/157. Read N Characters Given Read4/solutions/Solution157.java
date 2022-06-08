public class Solution157 extends Reader4 {

    public int read(char[] buf, int n) {
        char[] read4Buffer = new char[4];
        boolean finished = false;
        int bytesRead = 0;

        while (!finished && bytesRead < n) {
            int read4Bytes = read4(read4Buffer);
            if (read4Bytes < 4) {
                finished = true;
            }
            int bytes = Math.min(n - bytesRead, read4Bytes);
            System.arraycopy(read4Buffer, 0, buf, bytesRead, bytes);
            bytesRead += bytes;
        }
        return bytesRead;
    }
}