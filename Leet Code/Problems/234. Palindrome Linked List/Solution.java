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
       ListNode ptr_slow=head;
       ListNode ptr_fast=head;
       ListNode rev_head=null;
       while(ptr_fast!=null && ptr_fast.next!=null)
       {
           rev_head=new ListNode(ptr_slow.val,rev_head);
           ptr_slow=ptr_slow.next;
           ptr_fast=ptr_fast.next.next;
       }
       ptr_slow=(ptr_fast!=null)?ptr_slow.next:ptr_slow;
       while(ptr_slow!=null)
       {
           if(ptr_slow.val!=rev_head.val)
           {
               return false;
           }
           ptr_slow=ptr_slow.next;
           rev_head=rev_head.next;
       }
       return true;
    }
}
