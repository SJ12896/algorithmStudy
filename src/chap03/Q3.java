package chap03;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[j++] = i;
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (idx[i] != 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a =  {1, 2, 3, 4, 3, 3, 2, 1};
        int[] idx = new int[a.length];

        System.out.print(searchIdx(a, 8, 3, idx));
    }
}
