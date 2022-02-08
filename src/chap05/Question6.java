package chap05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question6 {
    static void move(int no, int x, int y) {
        Map<String, String> ht = new HashMap<String, String>();

        ht.put("1", "A");
        ht.put("2", "B");
        ht.put("3", "C");

//        int now =
//        while(true) {
//            if ()
//        }

//        if (no > 1)
//            move(no -1, x, 6 - x - y);
//
//        System.out.println("원반[" + no + "]을 " + ht.get(String.valueOf(x)) + "기둥에서 " + ht.get(String.valueOf(y)) + "기둥으로 옮김");
//
//        if (no > 1)
//            move (no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.println("원반 개수: ");
        int n = sc.nextInt();

        move(n, 1, 3);
    }
}
