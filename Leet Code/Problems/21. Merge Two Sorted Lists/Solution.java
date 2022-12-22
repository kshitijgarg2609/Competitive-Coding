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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1==null)
        {
            return list2;
        }
        else if(list2==null)
        {
            return list1;
        }
        ListNode head=null,ptr=null;
        while(list1!=null && list2!=null)
        {
            int val;
            if(list1.val<=list2.val)
            {
                val=list1.val;
                list1=list1.next;
            }
            else
            {
                val=list2.val;
                list2=list2.next;
            }
            if(head==null)
            {
                head=new ListNode(val);
                ptr=head;
            }
            else
            {
                ptr.next=new ListNode(val);
                ptr=ptr.next;
            }
        }
        while(list1!=null)
        {
            ptr.next=new ListNode(list1.val);
            ptr=ptr.next;
            list1=list1.next;
        }
        ptr.next=list2;
        return head;
    }
}
