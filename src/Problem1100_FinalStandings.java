/**
 * Created by Justin on 2/5/14.
 */
import java.io.*;
import java.util.*;
public class Problem1100_FinalStandings {
    private static class Team {
        int id;
        int m;
        Team(int id, int m) {
            this.id = id;
            this.m = m;
        }
    }
    private static ArrayList<Team> bubbleSort(ArrayList<Team> a) {
        boolean f = true;
        while (f) {
            f = false;
            for (int i = 0; i < a.size() - 1; i++) {
                Team t1 = a.get(i);
                Team t2 = a.get(i + 1);
                if (t2.m > t1.m) {
                    a.set(i, t2);
                    a.set(i + 1, t1);
                    f = true;
                }
            }
        }
        return a;
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
    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<Team> teams = new ArrayList<Team>();
        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            int m = in.nextInt();
            Team t = new Team(id, m);
            teams.add(t);
        }
        teams = bubbleSort(teams);
        for (Team t : teams) {
            out.print(t.id);
            out.print(' ');
            out.print(t.m);
            out.println();
            out.flush();
        }
    }
}
