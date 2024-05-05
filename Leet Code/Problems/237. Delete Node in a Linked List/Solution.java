/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    public void deleteNode(ListNode node)
    {
        ListNode prev=node;
        for(;node.next!=null;prev=node,node.val=(node=node.next).val);
        prev.next=null;
    }
}
