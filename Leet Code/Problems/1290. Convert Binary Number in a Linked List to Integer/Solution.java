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
    public int getDecimalValue(ListNode head)
    {
        ListNode ptr;
        int cnt=0;
        for(ptr=head;ptr!=null;cnt++,ptr=ptr.next);
        int mul=1<<(cnt-1);
        cnt=0;
        for(ptr=head;ptr!=null;ptr=ptr.next)
        {
            cnt+=(mul*ptr.val);
            mul/=2;
        }
        return cnt;
    }
}
