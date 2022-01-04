package chap01;

public class Quesetion3 {
    static int min4(int a, int b, int c, int d) {
        int result = a;
        if (result > b) result = b;
        if (result > c) result = c;
        if (result > d) result = d;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(min4(213, 44, 131, 2));
    }
}
