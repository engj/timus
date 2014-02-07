/**
 * Created by Justin on 2/1/14.
 */
public class test {
    public static void main(String[] args) {
        int[] p = new int[10];
        p[0] = 1; p[1] = 5; p[2] = 8;
        p[3] = 9; p[4] = 10; p[5] = 17;
        p[6] = 17; p[7] = 20; p[8] = 24;
        p[9] = 30;
        int r4 = cutRod(p, 4);
        System.out.println(r4);
    }
    private static int max(int a, int b) {
        if (b > a) {
            return b;
        }
        return a;
    }
    private static int cutRod(int[] p, int n) {
        if (n == 0) {
            return 0;
        }
        int q = 0;
        for (int i = 1; i <= n; i++) {
            int b = p[i - 1] + cutRod(p, n - i);
            q = max(q, b);
        }
        return q;
    }
}
