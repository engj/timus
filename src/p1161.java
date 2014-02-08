/**
 * Created by Justin on 2/1/14.
 */
import java.util.*;
import java.io.*;
public class p1161 {
    private static double weight(double a, double b) {
        return 2*Math.sqrt(a*b);
    }
    private static int[] insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            int j;
            for (j = i; j > 0; j--) {
                if (n > a[j - 1]) {
                    a[j] = a[j - 1];
                } else {
                    break;
                }
            }
            a[j] = n;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < s.length; i++) {
            int c = in.nextInt();
            s[i] = c;
        }
        s = insertionSort(s);
        double r = s[0];
        for (int i = 1; i < s.length; i++) {
            r = weight(r, s[i]);
        }
        out.printf("%.2f", r);
        out.flush();
    }
}