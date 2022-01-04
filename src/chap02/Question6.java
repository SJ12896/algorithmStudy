package chap02;

import java.util.Scanner;

public class Question6 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 31;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits--] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
            do {
                System.out.println("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);
            do {
                System.out.println("어떤 진수로 변환할까요? (2~36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);
        dno = cardConv(no, cd, cno);

        System.out.print(cd + "진수로는 ");
        for (int i = dno ; i < 32; i++)
            System.out.print(cno[i]);
        System.out.println("입니다.");

    }
}
