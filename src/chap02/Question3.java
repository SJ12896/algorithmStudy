package chap02;

public class Question3 {
    static int sumOf(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length / 2; i++) {
            result += a[i] + a[a.length-1-i];
        }
        if (a.length % 2 == 1) {
            result += a[(a.length-1) / 2];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5, 6};
        int[] data2 = { 1, 2, 3, 4, 5};
        System.out.println(sumOf(data));
        System.out.println(sumOf(data2));
    }
}
