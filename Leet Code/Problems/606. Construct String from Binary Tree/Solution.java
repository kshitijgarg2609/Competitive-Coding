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
    public String tree2str(TreeNode root)
    {
        if(root==null)
        {
            return "";
        }
        String left=String.format("(%s)",tree2str(root.left));
        String right=String.format("(%s)",tree2str(root.right));
        if(left.length()==2 && right.length()==2)
        {
            left=right="";
        }
        else if(right.length()==2)
        {
            right="";
        }
        return String.format("%d%s%s",root.val,left,right);
    }
}
