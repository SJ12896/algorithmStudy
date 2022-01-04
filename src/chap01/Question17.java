package chap01;

public class Question17 {
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat((n*2)/2 - i) + String.valueOf(i).repeat(i*2-1) + " ".repeat((n*2)/2 - i));
        }
    }

    public static void main(String[] args) {
        npira(4);
    }
}
