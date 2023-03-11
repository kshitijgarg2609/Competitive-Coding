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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
    public TreeNode sortedListToBST(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return (head==null)?null:(new TreeNode(head.val));
        }
        ListNode pre=null,ptr=null,fast=null;
        for(pre=null,ptr=head,fast=head;fast!=null && fast.next!=null;pre=ptr,ptr=ptr.next,fast=fast.next.next);
        TreeNode root = new TreeNode(ptr.val);
        pre.next=null;
        root.left=(sortedListToBST(head));
        root.right=(sortedListToBST(ptr.next));
        return root;
    }
}
