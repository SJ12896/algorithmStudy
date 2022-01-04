package chap01;

public class Question11 {
    static int printNumnber(int n) {
        String number = String.valueOf(n);
        return number.length();
    }

    public static void main(String[] args) {
        System.out.println(printNumnber(432));
        System.out.println(printNumnber(1212));
        System.out.println(printNumnber(24234));
        System.out.println(printNumnber(1));

    }
}
