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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode sum=new ListNode(0);
        ListNode tail=sum;
        while(l1!=null || l2!=null || carry!=0)
        {
            int a=carry;
        if(l1!=null)
        {
            a+=l1.val;
            l1=l1.next;
        }
        if(l2!=null)
        {
            a+=l2.val;
            l2=l2.next;
        }
        carry=a/10;
        tail.next=new ListNode(a%10);
        tail=tail.next;
        }
        return sum.next;
        
        
        
    }
}