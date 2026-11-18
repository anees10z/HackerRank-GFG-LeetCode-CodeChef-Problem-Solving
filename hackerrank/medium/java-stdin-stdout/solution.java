import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double point = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + point);
        System.out.println("Int: " + num);
    }
}
