package chap05;

import java.util.Scanner;

public class Question2 {
    static int gcd(int x, int y) {
        int temp = x;
        if (x > y) {
            x = y;
            y = temp;
        }

        int result = 1;
        for (int i = 2; i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구한다.");

        System.out.print("정수를 입력하세요. : "); int x = sc.nextInt();
        System.out.print("정수를 입력하세요. : "); int y = sc.nextInt();

        System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
    }
}
