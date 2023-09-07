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
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        if(left<right)
        {
            ListNode start=null,rev_point=null,ptr=null,end=null;
            int i=1;
            for(rev_point=head;i<left;i++,start=rev_point,rev_point=rev_point.next);
            if(start!=null)
            {
                start.next=null;
            }
            for(ptr=rev_point;i<right;i++,ptr=ptr.next);
            end=ptr.next;
            ptr.next=null;
            for(ptr=rev_point.next,rev_point.next=null;ptr!=null;)
            {
                ListNode nxt=ptr.next;
                ptr.next=rev_point;
                rev_point=ptr;
                ptr=nxt;
            }
            if(start!=null)
            {
                start.next=rev_point;
            }
            else
            {
                head=rev_point;
            }
            for(ptr=rev_point;ptr!=null && ptr.next!=null;ptr=ptr.next);
            ptr.next=end;
        }
        return head;
    }
}
