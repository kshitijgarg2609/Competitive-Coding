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
    public int pairSum(ListNode head)
    {
        int max=0;
        ListNode ptr1=null;
        ListNode mid=head;
        ListNode ptr2=null;
        for(ListNode fast=head;fast!=null && fast.next!=null;ptr1=mid,mid=mid.next,fast=fast.next.next);
        ptr1.next=null;
        for(ptr1=mid.next,mid.next=null;ptr1!=null;ptr2=ptr1.next,ptr1.next=mid,mid=ptr1,ptr1=ptr2);
        for(ptr1=head,ptr2=mid;ptr1!=null;max=Integer.max(max,ptr1.val+ptr2.val),ptr1=ptr1.next,ptr2=ptr2.next);
        return max;
    }
}
