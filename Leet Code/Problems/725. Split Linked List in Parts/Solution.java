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
    public ListNode[] splitListToParts(ListNode head, int k)
    {
        int n=0;
        for(ListNode ptr=head;ptr!=null;n++,ptr=ptr.next);
        ListNode arr[] = new ListNode[k];
        int equal=n/k,extra=n%k;
        ListNode ptr=head;
        for(int i=0;i<k;i++)
        {
            ListNode current=null;
            for(int j=0;j<(equal+((i<extra)?1:0));j++,ptr=ptr.next)
            {
                if(current==null)
                {
                    arr[i]=new ListNode(ptr.val);
                    current=arr[i];
                }
                else
                {
                    current.next=new ListNode(ptr.val);
                    current=current.next;
                }
            }
        }
        return arr;
    }
}
