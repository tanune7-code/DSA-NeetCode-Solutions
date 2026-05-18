class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to seamlessly handle removing the head node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // 1. Move the fast pointer n steps forward
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // 2. Move both pointers together until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // 3. Delete the target node (slow.next is the node to delete)
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
