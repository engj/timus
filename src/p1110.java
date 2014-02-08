/**
 * Created by Justin on 1/31/14.
 */
import java.util.*;
import java.io.*;
public class p1110 {
    private static int powMod(int x, int n, int m) {
        if (n == 1) {
            return x;
        }
        int term = powMod(x, n/2, m);
        if (n % 2 == 0) {
            return term * term % m;
        } else {
            return term * term * x % m;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        boolean flag = false;
        for (int x = 0; x <= m - 1; x++) {
            if (powMod(x, n, m) == y) {
                flag = true;
                out.print(x);
                out.print(' ');
                out.flush();
            }
        }
        if (!flag) {
            out.print(-1);
            out.flush();
        }
    }
}
