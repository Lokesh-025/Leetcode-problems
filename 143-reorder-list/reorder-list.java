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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(sec!=null)
        {
          ListNode next=sec.next; 
         sec.next=prev;         
        prev=sec;             
        sec=next; 
        }
        ListNode fir=head;
        sec=prev;
        while(sec!=null)
        {
            ListNode a=fir.next;
            ListNode b=sec.next;
            fir.next=sec;
            sec.next=a;
            fir=a;
            sec=b;
        }
        
        
    }
}