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
    public ListNode partition(ListNode head, int x)
    {
        ListNode left=null,right=null,lptr=null,rptr=null;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ptr.val<x)
            {
                lptr=(left==null)?(left=new ListNode(ptr.val)):(lptr.next=new ListNode(ptr.val));
            }
            else
            {
                rptr=(right==null)?(right=new ListNode(ptr.val)):(rptr.next=new ListNode(ptr.val));
            }
        }
        if(left!=null)
        {
            lptr.next=right;
        }
        return (left!=null)?left:right;
    }
}
