package chap05;

public class Question5 {
    static void recur3(int n) {
//        while (n > 0) {
//            System.out.println(n - 1);
//        }
        if (n > 0) {
            recur3(n-1);
            recur3(n-2);
            System.out.println(n);
        }
    }

    static void recur4(int n) {

    }

    public static void main(String[] args) {
        recur3(6);
    }
}
