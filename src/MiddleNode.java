import java.util.*;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 */
public class MiddleNode {
//    public static ListNode middleNode(ListNode head) {
//        if (head.next == null) return head;
//        ListNode tmpNode = head;
//        Map<Integer, ListNode> map = new HashMap<>();
//        int count = 0;
//        while(tmpNode != null) {
//            map.put(count, tmpNode);
//            count++;
//            tmpNode = tmpNode.next;
//        }
//        int middleNode = count % 2 == 0 ? count / 2 : (count - 1) / 2;
//        return map.get(middleNode);
//    }

    public static ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode fastPointer = head.next;
        ListNode slowPointer = head;
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            if (fastPointer.next == null) {
                return slowPointer.next;
            } else {
                fastPointer = fastPointer.next;
            }
            slowPointer = slowPointer.next;
        }
        return slowPointer.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


