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
    public ListNode mergeNodes(ListNode head)
    {
        ListNode list = new ListNode();
        for(ListNode ptr = head.next,last = list;ptr!=null;ptr=ptr.next)
        {
            if(ptr.val==0)
            {
                if(ptr.next!=null)
                {
                    last.next=new ListNode();
                    last=last.next;
                }
            }
            else
            {
                last.val+=ptr.val;
            }
        }
        return list;
    }
}
