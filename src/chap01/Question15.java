package chap01;

public class Question15 {
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    static void triangleLU(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }

    static void triangleRU(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(" ".repeat(n-i) + "*".repeat(i));
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i) + "*".repeat(i));
        }
    }

    public static void main(String[] args) {
        triangleLB(5);
        triangleLU(5);
        triangleRU(5);
        triangleRB(5);
    }
}
