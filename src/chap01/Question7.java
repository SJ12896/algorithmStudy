package chap01;

public class Question7 {
    static int sumN(int n) {
        int sumn = 0;
        for (int i = 1; i < n+1; i++) {
            sumn += i;
        }
        return sumn;
    }

    public static void main(String[] args) {
        System.out.println(sumN(7));
    }
}
