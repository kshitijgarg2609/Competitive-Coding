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
    public ListNode reverseList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode ptr1,ptr2;
        for(ptr1=head.next,head.next=null;ptr1!=null;)
        {
            ptr2=ptr1.next;
            ptr1.next=head;
            head=ptr1;
            ptr1=ptr2;
        }
        return head;
    }
}
