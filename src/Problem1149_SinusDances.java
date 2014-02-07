/**
 * Created by Justin on 2/4/14.
 */
import java.io.*;
import java.util.*;
public class Problem1149_SinusDances {
    private static String generateSN(int n) {
        String r = "";
        int j = 1;
        for (int i = n; i >= 1; i--) {
            if (r.isEmpty()) {
                r = generateAN(j) + "+" + i;
            } else {
                r =  "(" + r + ")" + generateAN(j) + "+" + i;
            }
            j++;
        }
        return r;
    }
    private static String generateAN(int n) {
        String r = "sin(" + n + ")";
        String operator;
        boolean s = true;
        for (int i = n; i > 1; i--) {
            if (i % 2 == 0) {
                operator = "-";
            } else {
                operator = "+";
            }
            r = "sin(" + (i - 1) + operator + r + ")";
            if (s == true) {
                s = false;
            } else {
                s = true;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        String r = generateSN(n);
        out.print(r);
        out.flush();
    }
}