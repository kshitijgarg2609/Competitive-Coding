/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    public boolean hasCycle(ListNode head)
    {
        for(ListNode ptr_1x=head,ptr_2x=head!=null?head.next:null;ptr_2x!=null && ptr_2x.next!=null;)
        {
            ptr_1x=ptr_1x.next;
            ptr_2x=ptr_2x.next.next;
            if(ptr_1x==ptr_2x)
            {
                return true;
            }
        }
        return false;
    }
}
