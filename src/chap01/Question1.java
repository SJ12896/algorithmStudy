package chap01;

public class Question1 {
    static int max4(int a, int b, int c, int d) {
        int result = a;
        if (b > result) result = b;
        if (c > result) result = c;
        if (d > result) result = d;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max4(32,34,1,56));
        System.out.println(max4(132,24,111,56));
    }
}
