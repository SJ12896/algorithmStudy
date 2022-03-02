package chap07;

public class IntSet {
    private int max;
    private int num;
    private int[] set;

    public IntSet(int capacity) {
        num = 0;
        max = capacity;
        try {
            set = new int[max];
        }
        catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
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

    public boolean add(int n) {
        if (num >= max || contains(n) == true)
            return false;
        else {
            set[num++] = n;
        }
        return true;
    }

    public boolean remove(int n) {
        int idx;

        if (num <= 0 || (idx = indexOf(n)) == -1)
            return false;
        else {
            set[idx] = set[--num];
            return true;
        }
    }

    public void copyTo(IntSet s) {
        int n = (s.max < num) ? s.max: num;
        for (int i = 0; i < n; i++)
            s.set[i] = set[i];
        s.num = n;
    }

    public void copyFrom(IntSet s) {
        int n = (max < s.num) ? max: s.num;
        for (int i = 0; i < n; i++)
            set[i] = s.set[i];
        num = n;
    }

    public boolean equalTo(IntSet s) {
        if (num != s.num)
            return false;

        for (int i = 0; i < num; i++) {
            int j = 0;
            for ( ; j < s.num; j++)
                if (set[i] == s.set[j])
                    break;
            if (j == s.num)
                return false;
        }
        return false;
    }

    public void unionOf(IntSet s1, IntSet s2) {
        copyFrom(s1);
        for (int i = 0; i < s2.num; i++)
            add(s2.set[i]);
    }

    public String toString() {
        StringBuffer temp = new StringBuffer("{");
        for (int i = 0; i < num; i++)
            temp.append(set[i] + " ");
        temp.append("}");
        return temp.toString();
    }

    public boolean isEmpty() {
        if (num == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (num == max) {
            return true;
        }
        return false;
    }

    public void clear() {
        set = new int[max];
    }

    public boolean add(IntSet s) {
        boolean flag = false;
        for (int i = 0; i < s.num; i++) {
            add(s.set[i]);
            flag = true;
        }

        return flag;
    }

    public boolean retain(IntSet s) {
        boolean flag = false;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < s.num; j++) {
                if (set[i] != s.set[j]) {
                    remove(s.set[i]);
                    flag = true;
                }
            }
        }

        return flag;
    }


    public boolean remove(IntSet s) {
        boolean flag = false;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < s.num; j++) {
                if (set[i] == s.set[j]) {
                    remove(s.set[i]);
                    flag = true;
                }
            }
        }

        return flag;
    }

    public boolean isSubsetOf(IntSet s) {
        boolean flag = true;

        for (int i = 0; i < num; i++) {
            if (!s.contains(set[i])) {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isProperSubsetOf(IntSet s) {
        if (s.num == num)
            return false;

        boolean flag = true;

        for (int i = 0; i < num; i++) {
            if (!s.contains(set[i])) {
                flag = false;
            }
        }
        return flag;
    }

    public void intersectionOf(IntSet s1, IntSet s2) {
        for (int i = 0; i < s1.num; i++) {
            for (int j = 0; j < s2.num; j++) {
                if (s1.set[i] == s2.set[j]) {
                    add(s1.set[i]);
                }
            }
        }
    }

    public void differenceOf(IntSet s1, IntSet s2) {
        for (int i = 0; i < s1.num; i++) {
            for (int j = 0; j < s2.num; j++) {
                if (s1.set[i] != s2.set[j]) {
                    add(s1.set[i]);
                }
            }
        }
    }
}
