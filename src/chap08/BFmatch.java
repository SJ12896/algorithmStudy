package chap08;

import java.util.Scanner;

public class BFmatch {
    static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;
        int cnt = -1;
        int matchCnt = 0;

        while (pt != txt.length() && pp != pat.length()) {
            matchCnt++;
            if (pp == 0) cnt ++;
            System.out.println(txt);
            System.out.print(" ".repeat(cnt + pp));
            if (txt.charAt(pt) == pat.charAt(pp)) {
                System.out.println("+");
                System.out.print(" ".repeat(cnt));
                System.out.print(pat+"\n");
                pt++;
                pp++;
            } else {
                System.out.println("|");
                System.out.print(" ".repeat(cnt));
                System.out.print(pat+"\n");
                pt = pt - pp + 1;
                pp = 0;
            }

        }
        if (pp == pat.length()) {
            System.out.println("비교는 " + matchCnt + "회");
            return pt - pp;
        }
        return -1;
    }

    static int bfMatchLast(String txt, String pat) {
        int pt = txt.length()-1;
        int pp = pat.length()-1;

        while (pt != 0 && pp != 0) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt--;
                pp--;
            } else {
                pt = pt - pp - 1;
                pp = 0;
            }

        }
        if (pp == 0)
            return pt - pp;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("텍스트: ");
        String s1 = sc.next();

        System.out.print("패턴: ");
        String s2 = sc.next();

        // int idx = bfMatch(s1, s2);
        int idx = bfMatchLast(s1, s2);

        if (idx == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        else {
            int len = 0;
            for (int i = idx; i > 0; i--) {
                len += s1.substring(i-1, i).getBytes().length;
            }

            len += s2.length();
        System.out.println("뒤에서 " + (idx + 1) + "번째 문자부터 일치합니다.");
        System.out.println("텍스트: " + s1);
        System.out.printf(String.format("패턴 : %%%ds\n", len), s2);  // 자리수 지정하기
        }
    }
}
