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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        int i=1,size=0;
        ListNode prev=null,ptr=null;
        for(ptr=head;ptr!=null;ptr=ptr.next,size++);
        for(ptr=head;i<=size-n;i++,prev=ptr,ptr=ptr.next);
        if(prev==null)
        {
            head=head.next;
            ptr.next=null;
        }
        else
        {
            prev.next=ptr.next;
            ptr.next=null;
        }
        return head;
    }
}
