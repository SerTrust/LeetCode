package org.example.Linked;

public class RemoveElements {

//  203. Remove Linked List Elements

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode result = new ListNode(-1, head);
        ListNode dummy = result;
        ListNode temp = head;

        while (temp != null){
            if (temp.val == val){
                dummy.next = temp.next;
            }else{
                dummy = temp;
            }
            temp = temp.next;
        }

        return result.next;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
