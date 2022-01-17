package chap04;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수: " + s.size() + " / "
            + s.capacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5) 비우기 (6) 값 찾기 (7) 비었는지 확인 (8) 꽉찼는지 확인 (0)종료 : ");
            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.print("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.print("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    s.clear();
                    break;

                case 6:
                    System.out.print("찾을 값: ");
                    x = sc.nextInt();
                    s.indexOf(x);

                case 7:
                    s.isEmpty();

                case 8:
                    s.isFull();
            }
        }
    }
}
