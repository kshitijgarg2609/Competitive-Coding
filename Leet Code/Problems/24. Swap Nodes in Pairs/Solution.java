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
    public ListNode swapPairs(ListNode head)
    {
        for(ListNode ptr=head;ptr!=null && ptr.next!=null;ptr=ptr.next)
        {
            ListNode nxt=ptr.next;
            int tmp=ptr.val;
            ptr.val=nxt.val;
            nxt.val=tmp;
            ptr=nxt;
        }
        return head;
    }
}
