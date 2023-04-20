package Solutions.week14;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListApp {

    ListNode head;
    ListNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void printListNode() {

        ListNode current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.value + "=> null");
            } else {
                System.out.println(current.value + "=>");
            }
            current = current.next;
        }
    }

    void add(int n) {

        ListNode node = new ListNode(n);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public boolean isPalindrome(ListNode head) {

        Deque<Integer> list = new LinkedList<>();
        ListNode current = head;

        while (current != null) {
            list.push(current.value);
            current = current.next;
        }
        current = head;

        while (current != null && !list.isEmpty()) {
            if (current.value != list.pop()) {
                return false;
            } else {
                current = current.next;
            }
        }
        return true;
    }
}
