/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ListNode ptra=null,ptrb=null;
        int cnta=0,cntb=0;
        for(ptra=headA;ptra!=null;cnta++,ptra=ptra.next);
        for(ptrb=headB;ptrb!=null;cntb++,ptrb=ptrb.next);
        for(ptra=headA,ptrb=headB;cnta!=cntb;)
        {
            if(cnta>cntb)
            {
                ptra=ptra.next;
                cnta--;
            }
            else
            {
                ptrb=ptrb.next;
                cntb--;
            }
        }
        for(;ptra!=null && ptrb!=null && ptra!=ptrb;ptra=ptra.next,ptrb=ptrb.next);
        return ptra;
    }
}
