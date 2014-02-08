/**
 * Created by Justin on 2/7/14.
 */
import java.io.*;
import java.util.*;
public class p1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int r = n * (m + 1);
        out.print(r);
        out.flush();
    }
}
