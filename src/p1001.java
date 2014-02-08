/**
 * Created by Justin on 2/6/14.
 */
import java.io.*;
import java.util.*;

public class p1001
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        double[] input = new double[131072];
        int top = 0;
        while (in.hasNextDouble() && top < input.length) {
            double a = in.nextDouble();
            input[top] = a;
            top++;
        }
        in.close();
        for (int i = top - 1; i >= 0; i--) {
            out.printf("%.4f", Math.sqrt(input[i]));
            out.println();
            out.flush();
        }
    }
}