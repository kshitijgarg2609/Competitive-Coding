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
class Solution
{
    public ListNode doubleIt(ListNode head)
    {
        int carry=0;
        ListNode rev=head,ptr=head.next,dbl=null;
        for(head.next=null;ptr!=null;ptr=ptr.next)
        {
            rev=new ListNode(ptr.val,rev);
        }
        for(ptr=rev;ptr!=null;ptr=ptr.next)
        {
            int mult=(2*ptr.val)+carry;
            dbl=new ListNode(mult%10,dbl);
            carry=mult/10;
        }
        if(carry!=0)
        {
            dbl=new ListNode(carry,dbl);
        }
        return dbl;
    }
}
