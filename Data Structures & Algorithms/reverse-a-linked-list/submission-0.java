/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        // Handle empty or single-node list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;     //A->B->C->null
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Save next
            current.next = prev;              // //  A->null(B is not linked) ,Reverse link
            prev = current;                   // (prev is now standing on A)Move prev forward
            current = nextNode;               // Move current forward
        }

        return prev; // New head of the reversed list
    }
}

