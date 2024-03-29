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
    public int minDiffInBST(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode ptr = root;
        Integer a=null,b=null;
        int diff = Integer.MAX_VALUE;
        while(ptr!=null || !stack.empty())
        {
            if(ptr!=null)
            {
                stack.push(ptr);
                ptr=ptr.left;
            }
            else
            {
                ptr=stack.pop();
                if(a==null)
                {
                    a=ptr.val;
                }
                else
                {
                    b=ptr.val;
                    diff=Integer.min(diff,b-a);
                    a=b;
                }
                ptr=ptr.right;
            }
        }
        return diff;
    }
}
