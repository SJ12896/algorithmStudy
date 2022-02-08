package chap05;

import java.util.Scanner;

public class Question1 {
    static double factorial(int n) {

        double result = 1;
        while (n > 1) {
            result *= n;
            n -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
