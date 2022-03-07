package chap09;
import java.util.Comparator;

public class LinkedListT<E> {
    class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> crnt;
    private Node<E> tail;

    public LinkedListT() {
        head = crnt = tail = null;
    }

    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;

        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;
            }
            tail = ptr;
            ptr = ptr.next;
        }
        return null;
    }

    public void addFirst(E obj) {
        Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
        tail = tail.next;
    }

    public void addLast(E obj) {
        if (head == null)
            addFirst(obj);
        else {
            if (tail == null) {
                Node<E> ptr = head;
                while (ptr.next != null)
                    ptr = ptr.next;
                ptr.next = crnt = new Node<E>(obj, null);
                tail = crnt;
            } else {
                tail.next = crnt = new Node<E>(obj, null);
            }

        }
    }

    public void removeFirst() {
        if (head != null)
            head = crnt = head.next;
    }

    public void removeLast() {
        if (head != null)
            if (head.next == null)
                removeFirst();
            else {
                if (tail == null) {
                    Node<E> ptr = head;
                    Node<E> pre = head;

                    while (ptr.next != null) {
                        pre = ptr;
                        ptr = ptr.next;
                    }
                    pre.next = null;
                    crnt = pre;
                } else {
                    tail = null;
                }
            }
    }

    public void remove(Node p) {
        if (head != null) {
            if (p == head)
                removeFirst();
        } else if (p == tail) {
            removeLast();
        } else {
            Node<E> ptr = head;

            while (ptr.next != p) {
                ptr = ptr.next;
                if (ptr == null) return;
            }
            ptr.next = p.next;
            crnt = ptr;
        }
    }

    public void removeCurrentNode() {
        remove(crnt);
    }

    public void clear() {
        while (head != null)
            removeFirst();
        crnt = null;
    }

    public boolean next() {
        if (crnt == null || crnt.next == null)
            return false;
        crnt = crnt.next;
        return true;
    }

    public void printCurrentNode() {
        if (crnt == null)
            System.out.println("선택한 노드가 없습니다.");
        else
            System.out.println(crnt.data);
    }

    public void dump() {
        Node<E> ptr = head;

        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public void purge(Comparator<? super E> c) {
        Node<E> ptr = head;
        Node<E> compareN = ptr.next;

        while (ptr != null) {
            if (c.compare(compareN.data, ptr.data) == 0) {
                remove(compareN);
            }
            compareN = compareN.next;
            if (compareN == null) {
                ptr = ptr.next;
                compareN = ptr.next;
            }
        }
    }

    public E retrieve(int n) {
        Node<E> ptr = head;
        int cnt = 0;

        while (ptr != null) {
            if (cnt == n) {
                return ptr.data;
            }
            cnt++;
            ptr = ptr.next;
        }
        return null;
    }
}

