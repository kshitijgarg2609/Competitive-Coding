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
    public void reorderList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode rev=null,break_point=null;
        for(ListNode slo=head,fst=head;slo!=null;slo=slo.next)
        {
            if(fst!=null && fst.next!=null)
            {
                break_point=slo;
                fst=fst.next.next;
                if(fst!=null && fst.next==null)
                {
                    break_point=break_point.next;
                    slo=slo.next;
                }
            }
            else
            {
                rev=new ListNode(slo.val,rev);
            }
        }
        break_point.next=null;
        for(ListNode ptr=head;rev!=null;)
        {
            ptr.next=new ListNode(rev.val,ptr.next);
            ptr=ptr.next.next;
            rev=rev.next;
        }
    }
}
