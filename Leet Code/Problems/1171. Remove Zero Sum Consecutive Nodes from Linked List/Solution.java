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
    public ListNode removeZeroSumSublists(ListNode head)
    {
        ListNode qu = new ListNode(0,head);
        Map<Integer,ListNode> map = new HashMap<>();
        int prfx=0,p;
        for(ListNode prev=null,ptr=qu;ptr!=null;ptr=ptr.next)
        {
            prfx+=ptr.val;
            if(!map.containsKey(prfx))
            {
                map.put(prfx,ptr);
                continue;
            }
            for(ptr=(prev=map.get(p=prfx)).next;(p+=ptr.val)!=prfx;map.remove(p),ptr=ptr.next);
            prev.next=ptr.next;
        }
        return qu.next;
    }
}
