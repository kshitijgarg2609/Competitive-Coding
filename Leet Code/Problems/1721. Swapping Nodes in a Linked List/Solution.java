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
    public ListNode swapNodes(ListNode head, int k)
    {
        int n=0;
        ListNode fst=null;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            n++;
            if(n==k)
            {
                fst=ptr;
            }
        }
        ListNode lst=head;
        for(int i=1;i<=n-k;i++,lst=lst.next);
        int tmp=fst.val;
        fst.val=lst.val;
        lst.val=tmp;
        return head; 
    }
}
