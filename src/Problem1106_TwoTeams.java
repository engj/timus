/**
 * Created by Justin on 2/4/14.
 */
import java.io.*;
import java.util.*;
public class Problem1106_TwoTeams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        in.nextLine();
        int[] team1 = new int[n];
        int[] team2 = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer line = new StringTokenizer(in.nextLine());
            boolean bad = false;
            while (line.hasMoreTokens()) {
                int f = Integer.parseInt(line.nextToken());
                if (f == 0) {
                    if (bad == true) {
                        out.print(0);
                        out.flush();
                        return;
                    }
                    break;
                }
                if (team1[f - 1] == 0) {
                    team1[i] = 1;
                    break;
                }
                if (team2[f - 1] == 0) {
                    team2[i] = 1;
                    break;
                }
                bad = true;
            }
        }
        int count = 0;
        for (int i = 0; i < team1.length; i++) {
            if (team1[i] == 1) {
                count++;
            }
        }
        out.print(count);
        out.println();
        for (int i = 0; i < team1.length; i++) {
            if (team1[i] == 1) {
                out.print(i + 1);
                out.print(' ');
            }
        }
        out.flush();
    }
}
