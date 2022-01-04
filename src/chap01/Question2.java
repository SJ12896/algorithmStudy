package chap01;

public class Question2 {
    static int min3(int a, int b, int c) {
        int result = a;
        if (result > b) result = b;
        if (result > c) result = c;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(min3(213, 44, 1312));
    }

}
