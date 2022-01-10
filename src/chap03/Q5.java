package chap03;

public class Q5 {
    static int binSearchX(int[] a, int n, int key) {
        int l = 0;
        int r = n-1;
        int result = 0;

        while(true) {
            int mid = (l+r) / 2;
            if (l >= r) {
                break;
            }
            if (a[mid] == key) {
                result = mid;
                r = mid;
            } else if (a[mid] > key) {
                r = mid-1;
            } else if (a[mid] < key) {
                l = mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
        System.out.print(binSearchX(a, 11, 7));
    }
}
