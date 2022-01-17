package chap04;

public class TwoStack {
    private int max, max2;
    private int ptr, ptr2;
    private int[] stk;

    public class EmptyTwoStackException extends RuntimeException {
        public EmptyTwoStackException() {
        }
    }

    public class OverflowTwoStackException extends RuntimeException {
        public OverflowTwoStackException() {
        }
    }

    public TwoStack(int capacity) {
        ptr = 0;
        ptr2 = max-1;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x, int y) throws TwoStack.OverflowTwoStackException {
        if (y == 1) {
            if (ptr >= max / 2)
                throw new TwoStack.OverflowTwoStackException();
            return stk[ptr++] = x;
        } else if (y == 2) {
            if (ptr2 <= max / 2)
                throw new TwoStack.OverflowTwoStackException();
            return stk[ptr2--] = x;
        } else {
            return -1;
        }
    }

    public int pop(int y) throws TwoStack.EmptyTwoStackException {
        if (y == 1) {
            if (ptr <= 0)
                throw new TwoStack.EmptyTwoStackException();
            return stk[--ptr];
        } else if (y == 2) {
            if (ptr2 >= max)
                throw new TwoStack.EmptyTwoStackException();
            return stk[++ptr2];
        } else {
            return -1;
        }
    }

    public int peek(int y) throws TwoStack.EmptyTwoStackException {
        if (y == 1) {
            if (ptr <= 0)
                throw new TwoStack.EmptyTwoStackException();
            return stk[ptr - 1];
        } else if (y == 2) {
            if (ptr2 >= max)
                throw new TwoStack.EmptyTwoStackException();
            return stk[++ptr2];
        } else {
            return -1;
        }
    }

    public int indexOf(int x, int y) {
        if (y == 1) {
            for (int i = ptr - 1; i >= 0; i--)
                if (stk[i] == x)
                    return i;
            return -1;
        } else if (y == 2) {
            for (int i = ptr2 + 1; i <= max; i++)
                if (stk[i] == x)
                    return i;
            return -1;
        } else {
            return -1;
        }
    }

    public void clear(int y) {
        if (y == 1)
            ptr = 0;
        else
            ptr2 = max / 2;
    }

    public int capacity() {
        return max / 2;
    }

    public int size(int y) {
        if (y == 1)
            return ptr;
        else
            return ptr2;
    }

    public boolean isEmpty(int y) {
        if (y == 1)
            return ptr <= 0;
        else
            return ptr2 >= max;
    }

    public boolean isFull(int y) {
        if (y == 1)
            return ptr >= max / 2;
        else
            return ptr2 <= max / 2;
    }

    public void dump(int y) {
        if (y == 1) {
            if (ptr <= 0)
                System.out.println("스택이 비어 있습니다.");
            else {
                for (int i = 0; i < ptr; i++)
                    System.out.println(stk[i] + " ");
                System.out.println();
            }
        } else if (y == 2) {
            if (ptr2 >= max)
                System.out.println("스택이 비어 있습니다.");
            else {
                for (int i = max; i < ptr2; i--)
                    System.out.println(stk[i] + " ");
                System.out.println();
            }
        } else {
            System.out.println("잘못 입력했습니다.");
        }
    }
}
