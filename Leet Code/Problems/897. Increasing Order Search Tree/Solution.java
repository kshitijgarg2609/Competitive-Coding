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
    public TreeNode increasingBST(TreeNode root)
    {
        TreeNode linear = null;
        TreeNode current = null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode ptr=root;
        while(ptr!=null || !stack.empty())
        {
            if(ptr!=null)
            {
                stack.push(ptr);
                ptr=ptr.left;
                continue;
            }
            ptr=stack.pop();
            if(linear==null)
            {
                linear=new TreeNode(ptr.val);
                current=linear;
            }
            else
            {
                current.right=new TreeNode(ptr.val);
                current=current.right;
            }
            ptr=ptr.right;
        }
        return linear;
    }
}
