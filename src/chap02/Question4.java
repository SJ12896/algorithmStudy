package chap02;

public class Question4 {
    static void copy(int[] a, int[] b) {
        // a = b.clone();
        for (int i = 0; i < a.length; i++)
            a[i] = b[i];
    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            a[a.length-1-i] = b[i];
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = {23, 423, 12, 11};
        rcopy(a, b);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
