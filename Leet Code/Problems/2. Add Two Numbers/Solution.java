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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode sum=new ListNode((l1.val+l2.val)%10);
        ListNode current=sum;
        int carry=(l1.val+l2.val)/10;
        for(l1=l1.next,l2=l2.next;l1!=null || l2!=null || carry!=0;current=current.next)
        {
            int a=0,b=0;
            if(l1!=null)
            {
                a=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                b=l2.val;
                l2=l2.next;
            }
            current.next=new ListNode((a+b+carry)%10);
            carry=(a+b+carry)/10;
        }
        return sum;
    }
}
