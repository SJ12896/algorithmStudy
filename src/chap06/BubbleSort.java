package chap06;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = n-1; j > i; j--)
                if (a[j-1] > a[j])
                    swap(a, j - 1, j);
    }

    // 버전2 : 패스 n-1회를 수행하기 전에 정렬이 끝났을 때
    static void bubbleSort2(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            for (int j = n-1; j > i; j--)
                if (a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            if (exchg == 0) break;
        }
    }

    // 버전3: 진행 중 앞 쪽은 이미 정렬되었을 때
    static void bubbleSort3(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int k = 0;
            while (k < n-1) {
                int last = n-1;
                for (int j = n-1; j > i; j--)
                    if (a[j-1] > a[j]) {
                        swap(a, j - 1, j);
                        last = j;
                    }
                k = last;
            }
        }
    }

    // 선택정렬
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
                swap(a, i, min);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
