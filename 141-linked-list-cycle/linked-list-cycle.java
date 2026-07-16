/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */public class Solution {
    public boolean hasCycle(ListNode head) { 
        if(head==null||head.next==null){
            return false;
        }ListNode f=head;
        ListNode l=head;
        while(l!=null&&l.next!=null){
            f=f.next;
            l=l.next.next;
            if(f==l){
                return true;
            }
        
        } 
        return false;
    }
}
