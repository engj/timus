/**
 * Created by Justin on 2/7/14.
 */
import java.io.*;
import java.util.*;
public class p1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        double[] candidates = new double[10000];
        for (int i = 0; i < m; i++) {
            int candidate = in.nextInt();
            candidates[candidate - 1]++;
        }
        for (int i = 0; i < n; i++) {
            double votes = candidates[i];
            double percentage = votes / m * 100;
            out.printf("%.2f", percentage);
            out.print('%');
            out.println();
            out.flush();
        }
    }
}
