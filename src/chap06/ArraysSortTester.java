package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i +"] : ");
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < num; i++)
            System.out.println("x[" + i +"] = " + x[i]);
    }
}
