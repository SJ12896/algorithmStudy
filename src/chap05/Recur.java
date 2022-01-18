package chap05;

import chap04.IntStack;

import java.util.Scanner;

public class Recur {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n-2);
        }
    }

    // 꼬리 재귀 제거
    static void recur2(int n) {
        while (n > 0) {
            recur(n-1);
            System.out.println(n);
            n = n - 2;
        }
    }

    // 스택 사용하는 방법
    static void recur3(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n -= 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n -= 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int x = sc.nextInt();

        recur(x);
    }
}
