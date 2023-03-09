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
 */
public class Solution
{
    public ListNode detectCycle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null)
        {
            if(fast.next==null)
            {
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        for(fast=head;slow!=null && fast!=null && slow!=fast;slow=slow.next,fast=fast.next);
        return slow;
    }
}
