/**
 * Created by Justin on 1/31/14.
 */
import java.util.*;
import java.io.*;
public class Problem1196_HistoryExam {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(System.out);
        HashSet<Integer> p = new HashSet<Integer>();
        int r = 0;
        int nP = sc.nextInt();
        for (int i = 0; i < nP; i++) {
            int d = sc.nextInt();
            int dI = new Integer(d);
            if (!p.contains(dI)) {
                p.add(dI);
            }
        }
        int nS = sc.nextInt();
        for (int i = 0; i < nS; i++) {
            int d = sc.nextInt();
            int dI = new Integer(d);
            if (p.contains(dI)) {
                r++;
            }
        }
        out.print(r);
        out.flush();
    }
    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
