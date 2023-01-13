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
        ListNode ptr=head.next;
        head.next=null;
        while(ptr!=null)
        {
            ListNode further_extract=ptr.next;
            ptr.next=head;
            head=ptr;
            ptr=further_extract;
        }
        return head;
    }
}
