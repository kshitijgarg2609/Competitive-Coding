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
    public TreeNode invertTree(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty())
        {
            TreeNode node_pop = stack.pop();
            if(node_pop!=null)
            {
                TreeNode tmp=node_pop.left;
                node_pop.left=node_pop.right;
                node_pop.right=tmp;
                stack.push(node_pop.left);
                stack.push(node_pop.right);
            }
        }
        return root;
    }
}
