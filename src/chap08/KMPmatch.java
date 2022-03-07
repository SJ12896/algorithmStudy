package chap08;

import java.util.Scanner;

public class KMPmatch {
    static int kmpMatch(String txt, String pat) {
        int pt = 1;  // txt 커서
        int pp = 0;  // pat 커서
        int[] skip = new int[pat.length() + 1];  // 건너뛰기 표

        skip[pt] = 0;
        while (pt != pat.length()) {
            if (pat.charAt(pt) == pat.charAt(pp))
                skip[++pt] = ++pp;
            else if (pp == 0)
                skip[++pt] = pp;
            else
                pp = skip[pp];
        }

        pt = pp = 0;
        int cnt = 0;

        while (pt != txt.length() && pp != pat.length()) {
            System.out.println(txt);
            if (txt.charAt(pt) == pat.charAt(pp)) {
                System.out.print(" ".repeat(cnt+pp));
                System.out.println("+");
                System.out.print(" ".repeat(cnt));
                System.out.println(pat);
                pt++;
                pp++;
            } else if (pp == 0) {
                cnt++;
                System.out.print(" ".repeat(cnt+pp));
                System.out.println("|");
                System.out.print(" ".repeat(cnt));
                System.out.println(pat);
                pt++;
            }
            else {
                System.out.print(" ".repeat(cnt+pp));
                System.out.println("|");
                System.out.print(" ".repeat(cnt));
                System.out.println(pat);
                pp = skip[pp];
                cnt++;
            }

        }
        if (pp == pat.length())
            return pt - pp;
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = sc.next();

        System.out.print("패턴: ");
        String s2 = sc.next();

        int idx = kmpMatch(s1, s2);

        if (idx == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        else {
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += s1.substring(i, i+1).getBytes().length;
            }

            len += s2.length();
            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트: " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len), s2);  // 자리수 지정하기
        }
    }
    }
