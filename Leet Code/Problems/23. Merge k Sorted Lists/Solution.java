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
    public ListNode mergeKLists(ListNode[] lists)
    {
        ListNode head=null;
        ListNode current=null;
        if(lists.length<2)
        {
            return (lists.length==0)?head:lists[0];
        }
        int mid=lists.length/2;
        ListNode left=mergeKLists(Arrays.copyOf(lists,mid));
        ListNode right=mergeKLists(Arrays.copyOfRange(lists,mid,lists.length));
        if(left==null || right==null)
        {
            return (left==null)?right:left;
        }
        while(left!=null && right!=null)
        {
            int val;
            if(left.val<=right.val)
            {
                val=left.val;
                left=left.next;
            }
            else
            {
                val=right.val;
                right=right.next;
            }
            if(head==null)
            {
                head=new ListNode(val);
                current=head;
            }
            else
            {
                current.next=new ListNode(val);
                current=current.next;
            }
        }
        if(left!=null)
        {
            current.next=left;
        }
        else
        {
            current.next=right;
        }
        return head;
    }
}
