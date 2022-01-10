package chap03;

public class Q2 {
    static void seqSearch(int[] a, int n, int key) {
        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("----".repeat(n));

        int i = 0;
        for (i = 0; i < n*3; i++) {
            if (i % 3 == 0) {
                System.out.print("   |");
                System.out.print("   ".repeat(i/3));
                System.out.print("  *");
                System.out.println();
                System.out.printf("%d  |", i/3);
            }
            else if (i % 3 == 1) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d", a[j]);
                }
                System.out.println();
                if (a[i/3] == key) {
                    System.out.printf("%d는 x[%d]에 있습니다.", key, i/3);
                    break;
                }
            }
            else {
                System.out.println("   |");
            }
        }
        if (i == n*3-1) {
            System.out.println("찾는 값이 없습니다.");
        }
    }

    public static void main(String[] args) {
        int[] a = {21, 2, 3, 34, 10, 2};
        seqSearch(a, 6, 10);
    }
}
