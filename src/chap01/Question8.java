package chap01;

public class Question8 {
    static int sumN(int n) {
        if ( n % 2 == 0) {
            return (1+n) * (n / 2);
        } else {
            return (1+n) * (n / 2) + (1 + n) / 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumN(10));
        System.out.println(sumN(11));
        System.out.println(sumN(12));
        System.out.println(sumN(13));
    }
}
