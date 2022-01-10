package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name; this.height = height; this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<Q7.PhyscData> VISION_ORDER
                = new Q7.PhyscData.VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<Q7.PhyscData> {
            public int compare(Q7.PhyscData d1, Q7.PhyscData d2) {
                return (d1.vision > d2.vision) ? 1 : (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q7.PhyscData[] x = {
                new Q7.PhyscData("박현규", 162, 0.3),
                new Q7.PhyscData("이수진", 168, 0.4),
                new Q7.PhyscData("함진아", 173, 0.7),
                new Q7.PhyscData("박용규", 169, 0.8),
                new Q7.PhyscData("김용준", 174, 1.2),
                new Q7.PhyscData("홍연의", 171, 1.5),
                new Q7.PhyscData("최윤미", 175, 2.0)

        };
        System.out.print("시력이 얼마인 사람을 찾고 있나요? : ");
        double vision = sc.nextDouble();
        int idx = Arrays.binarySearch(x, new Q7.PhyscData("", 0, vision),
                Q7.PhyscData.VISION_ORDER);

        if (idx < 0)
            System.out.println("요소가 없습니다.");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
