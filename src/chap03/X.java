package chap03;

public class X {
    public static final Comparator<T> COMPARATOR = new Comp();

    private static class Comp implements Comparator<T> {
        public int compare(T d1, T d2) {
        }
    }
}
