package study.effectivejavastudy;

import java.util.*;
public class Handout2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number1 :  ");
        int x = in.nextInt();
        System.out.print("number2 :  ");
        int y = in.nextInt();
        System.out.println("result : " + compare(x, y));
    }

    public static boolean compare(int x, int y) {
        if (x > 1000 || y > 1000) { return false; }
        int a = x % 10;
        int b = y % 10;
        x = x /= 10;
        y = y /= 10;
        int c = x % 10;
        int d = y % 10;
        int e = x /= 10;
        int f = y /= 10;
        return (e == f || e == b || e == d || a == f || a == b || a == d || c == f || c == b
                || c == d);
    }
}









