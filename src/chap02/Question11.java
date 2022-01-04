package chap02;

public class Question11 {
    static class YMD {
        static int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        };

        static int isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }

        int y;
        int m;
        int d;

//        static int dayOfYear(int y, int m, int d) {
//            int days = d;
//
//            for (int i = 1; i < m; i++)
//                days += mdays[isLeap(y)][i-1];
//            return days;
//        }

        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n) {
            int days = d+n;
            while (days > mdays[isLeap(y)][m]) {
                days -= (mdays[isLeap(y)][m] - d);
                    m += 1;
                    if (m >= 13) {
                        y += 1;
                        m = 1;
                    }
            }
            return new YMD(y, m, days);
        }

        YMD before(int n) {
            int days = d-n;
            while (days < 1) {
                days += mdays[isLeap(y)][m] - d;
                    m -= 1;
                    if (m <= 0) {
                        y -= 1;
                        m = 12;
                    }
            }
            return new YMD(y, m, d);
        }
    }
}
