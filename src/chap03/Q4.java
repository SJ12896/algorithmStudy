package chap03;

public class Q4 {
    static void binSearch(int[] a, int n, int key) {
        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("----".repeat(n));

        int l = 0;
        int r = n - 1;
        int i = 0;

        while (true) {
            int mid = (l + r) / 2;
            if (i % 3 == 0) {
                System.out.printf("%4s", "|");
                System.out.print("  ".repeat(l));
                System.out.printf("%3s", "<-");
                System.out.print("  ".repeat(mid-l));
                System.out.printf("%3s", "+");
                System.out.print("  ".repeat(r-mid));
                System.out.printf("%3s", "->");
                System.out.println();
                System.out.printf("%d  |", mid);
            } else if (i % 3 == 1) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d", a[j]);
                }
                System.out.println();
                if (l >= r || a[mid] == key ) {
                    break;
                } else if (a[mid] > key) {
                    r = mid - 1;
                } else if (a[mid] < key) {
                    l = mid + 1;
                }
            } else {
                System.out.println("   |");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] a = {21, 2, 3, 34, 10, 2};
        binSearch(a, 6, 10);
    }
}
