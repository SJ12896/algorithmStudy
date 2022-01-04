package chap02;

import java.util.Scanner;

public class Question8 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }
    static int dayOfYear(int y, int m, int d) {
        while(true) {


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("그 해 경과 일수를 구합니다.");

            System.out.println("년 : "); int year = sc.nextInt();
            System.out.println("월 : "); int month = sc.nextInt();
            System.out.println("일 : "); int day = sc.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));


    }
}
