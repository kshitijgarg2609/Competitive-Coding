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
    public ListNode modifiedList(int[] nums, ListNode head)
    {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        ListNode list = null;
        for(ListNode current=null;head!=null;head=head.next)
        {
            if(!set.contains(head.val))
            {
                if(list==null)
                {
                    list=new ListNode(head.val);
                    current=list;
                }
                else
                {
                    current.next=new ListNode(head.val);
                    current=current.next;
                }
            }
        }
        return list;
    }
}
