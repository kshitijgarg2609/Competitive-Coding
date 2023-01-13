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
    public ListNode removeElements(ListNode head, int val)
    {
        while(head!=null && head.val==val)
        {
            head=head.next;
        }
        ListNode joiner_ptr=head;
        while(joiner_ptr!=null && joiner_ptr.next!=null)
        {
            if(joiner_ptr.next.val==val)
            {
                ListNode running_ptr=joiner_ptr.next;
                while(running_ptr!=null)
                {
                    if(running_ptr.val!=val)
                    {
                        break;
                    }
                    running_ptr=running_ptr.next;
                }
                joiner_ptr.next=running_ptr;
            }
            joiner_ptr=joiner_ptr.next;
        }
        return head;
    }
}
