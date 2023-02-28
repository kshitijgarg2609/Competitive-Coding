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
    public ListNode deleteDuplicates(ListNode head)
    {
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            ListNode ptr2=ptr.next;
            ptr.next=null;
            while(ptr2!=null && ptr.val==ptr2.val)
            {
                ptr2=ptr2.next;
            }
            ptr.next=ptr2;
        }
        return head;
    }
}
