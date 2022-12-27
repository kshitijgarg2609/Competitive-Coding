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
    public boolean isSymmetric(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        Stack<TreeNode> left_solver = new Stack<>();
        left_solver.push(root.left);
        Stack<TreeNode> right_solver = new Stack<>();
        right_solver.push(root.right);
        while(!left_solver.empty() && !right_solver.empty())
        {
            TreeNode left_ptr=left_solver.pop();
            TreeNode right_ptr=right_solver.pop();
            if(left_ptr==null && right_ptr==null)
            {
                continue;
            }
            else if(left_ptr==null || right_ptr==null || left_ptr.val!=right_ptr.val)
            {
                return false;
            }
            left_solver.push(left_ptr.left);
            left_solver.push(left_ptr.right);
            right_solver.push(right_ptr.right);
            right_solver.push(right_ptr.left);
        }
        return true;
    }
}
