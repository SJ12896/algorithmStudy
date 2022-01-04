package chap01;

public class Question9 {
    static int sumof(int a, int b) {
        int temp = a;
        if (a > b) {
            a = b;
            b = temp;
        }
        int result = a;
        int i = a+1;
        while (i <= b) {
            result += i;
            i += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumof(2, 4));
        System.out.println(sumof(1, 7));
        System.out.println(sumof(2, 1));
        System.out.println(sumof(33, 99));

    }
}
