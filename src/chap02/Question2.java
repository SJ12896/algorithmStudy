package chap02;

import java.util.Scanner;

public class Question2 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length; j++)
                System.out.print(a[j]+" ");
            System.out.println();
            System.out.println("a["+String.valueOf(i)+"] 와 a["+String.valueOf(a.length - i - 1)+"] 를 교환합니다.");
            swap(a, i, a.length - i - 1);
        }
        for (int j = 0; j < a.length; j++)
            System.out.print(a[j]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");

    }
}
