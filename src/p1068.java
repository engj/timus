/**
 * Created by Justin on 1/31/14.
 */
import java.io.*;
import java.util.*;

public class p1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int r = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                r += i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                r += i;
            }
        }
        out.print(r);
        out.flush();
    }
}
