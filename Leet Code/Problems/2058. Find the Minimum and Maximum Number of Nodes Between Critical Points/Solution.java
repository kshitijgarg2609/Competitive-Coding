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
    public int[] nodesBetweenCriticalPoints(ListNode head)
    {
        int minmax[] = new int[]{-1,-1};
        ListNode ptr=head.next;
        for(int i=1,prev_point=head.val,prev=-1,start=-1,min=Integer.MAX_VALUE;ptr.next!=null;prev_point=ptr.val,ptr=ptr.next,i++)
        {
            if((ptr.val>prev_point && ptr.val>ptr.next.val) || (ptr.val<prev_point && ptr.val<ptr.next.val))
            {
                if(prev==-1 && start==-1)
                {
                    prev=start=i;
                }
                else
                {
                    minmax[0]=min=Integer.min(min,i-prev);
                    minmax[1]=i-start;
                    prev=i;
                }
            }
        }
        return minmax;
    }
}
