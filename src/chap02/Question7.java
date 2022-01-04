package chap02;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("10진수를 기수 변환합니다.");
        System.out.println("변환하는 음이 아닌 정수: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("어떤 진수로 변환할까요? (2-36) ");
        int m = sc.nextInt();

        int i = 0;

        System.out.printf("%d | %3d \n", m, n);
        System.out.println(" + -------");

        while (n > m) {
            n /= m;
            i = n % m;
                System.out.printf("%d | %3d %5d \n", m, n, i);
                System.out.println(" + -------");
        }
        System.out.printf("%7d %5d \n", n/m, i);
    }
}
