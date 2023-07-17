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
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        for(ListNode ptr=l1;ptr!=null;s1.add(ptr),ptr=ptr.next);
        for(ListNode ptr=l2;ptr!=null;s2.add(ptr),ptr=ptr.next);
        ListNode ans = null;
        int carry=0;
        while(carry!=0 || !s1.empty() || !s2.empty())
        {
            int a=s1.empty()?0:s1.pop().val;
            int b=s2.empty()?0:s2.pop().val;
            int sum=a+b+carry;
            carry=sum/10;
            ListNode nxt = new ListNode(sum%10,ans);
            ans=nxt;
        }
        return ans;
    }
}
