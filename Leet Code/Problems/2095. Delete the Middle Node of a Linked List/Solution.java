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
    public ListNode deleteMiddle(ListNode head)
    {
        ListNode prev=null,fast=head,slow=head;
        for(;fast!=null && fast.next!=null;prev=slow,slow=slow.next,fast=fast.next.next);
        if(prev!=null)
        {
            prev.next=slow.next;
            slow.next=null;
        }
        else
        {
            return null;
        }
        return head;
    }
}
