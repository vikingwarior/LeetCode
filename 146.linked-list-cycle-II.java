public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow) {
                break;
            }
        }
        
        if(fast == null || fast.next == null) return null;
        
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}