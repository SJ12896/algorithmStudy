package chap03;

public class Id {
    private static int counter = 0;  // 클래스
    private int id;

    public Id() { id = ++counter; }
    public int getId() { return id; }
    public static int getCounter() { return counter; } // 클래스
}

