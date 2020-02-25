import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryFlag = 0;
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        while(l1 != null || l2 != null) {
            int currentVal1 = 0;
            int currentVal2 = 0;
            if (l1 != null) {
                currentVal1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentVal2 = l2.val;
                l2 = l2.next;
            }
            int currentVal = currentVal1 + currentVal2 + carryFlag;
            if (currentVal >= 10) {
                currentVal -= 10;
                carryFlag = 1;
            } else {
                carryFlag = 0;
            }
            currentNode.val = currentVal;
            if (l1 != null || l2 != null) {
                currentNode.next = new ListNode(0);
                currentNode = currentNode.next;
            }
        }
        if (carryFlag != 0) {
            currentNode.next = new ListNode(1);
        }
        return result;
    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }