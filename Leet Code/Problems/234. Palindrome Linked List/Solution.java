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
    public boolean isPalindrome(ListNode head)
    {
        ListNode fst=head,rev=null;
        for(;fst!=null && fst.next!=null;fst=fst.next.next)
        {
            rev=new ListNode(head.val,rev);
            head=head.next;
        }
        if(fst!=null)
        {
            head=head.next;
        }
        for(;head!=null;head=head.next,rev=rev.next)
        {
            if(head.val!=rev.val)
            {
                return false;
            }
        }
        return true;
    }
}
