/**
 * Created by Justin on 2/4/14.
 */
import java.io.*;
import java.util.*;
public class test2 {
    private static class Team {
        private int id;
        int m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.reverse(list);
        for (Integer i : list) {
            out.print(i.intValue());
            out.println();
            out.flush();
        }
        Team blah = new Team();
        blah.id=2;
    }
}
