package chap02;

public class Question10 {
    static final int VMAX = 21;

    static void distVision(PhysicalExamination.PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
        }
    }

    public static void main(String[] args) {
        PhysicalExamination.PhyscData[] x = {
                new PhysicalExamination.PhyscData("박현규", 162, 0.1),
                new PhysicalExamination.PhyscData("함진아", 173, 0.1),
                new PhysicalExamination.PhyscData("최윤미", 175, 0.1),
                new PhysicalExamination.PhyscData("홍연의", 171, 1.2),
                new PhysicalExamination.PhyscData("이수진", 168, 0.2),
                new PhysicalExamination.PhyscData("김용준", 174, 1.2),
                new PhysicalExamination.PhyscData("박용규", 169, 0.2)
        };
        int[] vdist = new int[VMAX];

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f~ : %s\n", i / 10.0, "*".repeat(vdist[i]));
    }
}
