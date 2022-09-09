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
    public ListNode middleNode(ListNode head) {
        
    
        ListNode temp = head;
        int count = 0;
        
            //Condition to check if a linked list has only one element 
            if(head.next != null){
                
                //Counting the number of Nodes in Linked List
                while(temp != null){
                count++;
                temp=temp.next;
            }
            
            //Iterating halfway through the List
            for(int i=0; i<count/2;i++) head = head.next;
        }
        return head;
    }
}