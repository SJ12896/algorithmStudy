package chap05;

import java.util.Arrays;

import static java.util.logging.Logger.global;

public class Queestion3 {
    public static double result = 10e-1;
    static int gcdArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                result =  a[0] > result ? result : a[0];
                return a[0];
            }
            int temp = a[0];
            a[0] = a[i];
            a[i] = a[0] % a[i];
            gcdArray(a);
            a[0] = temp;
        }
        return (int) result;
    }


    public static void main(String[] args) {
        int[] a = {4, 8, 24, 6};
        // Arrays.sort(a);
        System.out.println("최대 공약수는 " + gcdArray(a) + "입니다.");
    }
}
