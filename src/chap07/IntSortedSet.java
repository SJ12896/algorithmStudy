package chap07;

public class IntSortedSet {
        private int max;
        private int num;
        private int[] set;

        public IntSortedSet(int capacity) {
            num = 0;
            max = capacity;
            try {
                set = new int[max];
            } catch (OutOfMemoryError e) {
                max = 0;
            }
        }

    public int indexOf(int n) {
        for (int i = 0; i < num; i++) {
            if (set[i] == n)
                return i;
        }
        return -1;
    }

    public boolean contains(int n) {
        return (indexOf(n) != -1) ? true : false;
    }

    public void swap(int n, int m) {
            int t = set[n];
            set[n] = m;
            set[m] = t;
    }

    public boolean add(int n) {
        if (num >= max || contains(n) == true)
            return false;
        else {
            int index = 0;
            if (num == 0) {
                set[num++] = n;
                return true;
            }

            for (int i = 0; i < num; i++) {
                if (set[i] > n) {
                    index = i+1;
                    break;
                }
            }
            for (int i = index; i < num; i++) {
                swap(i, i+1);
            }
            set[index-1] = n;
        }
        return true;
    }
}
