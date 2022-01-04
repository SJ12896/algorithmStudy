package chap01;

import java.util.Scanner;

public class Question10 {
    static int minus(int a, int b) {
        return b - a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b <= a) {
            System.out.println("b의 값은 a보다 커야합니다.");
            b = sc.nextInt();
        }
        System.out.println(minus(a, b));
    }


}
