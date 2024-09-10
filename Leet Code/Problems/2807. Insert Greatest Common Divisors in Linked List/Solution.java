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
    public ListNode insertGreatestCommonDivisors(ListNode head)
    {
        for(ListNode ptr=head;ptr.next!=null;ptr=ptr.next.next)
        {
            int gcd[] = new int[]{ptr.val,ptr.next.val};
            for(;gcd[1]>0;gcd=new int[]{gcd[1],gcd[0]%gcd[1]});
            ptr.next=new ListNode(gcd[0],ptr.next);
        }
        return head;
    }
}
