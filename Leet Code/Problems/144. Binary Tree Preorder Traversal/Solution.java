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
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty())
        {
            TreeNode node_pop = stack.pop();
            list.add(node_pop.val);
            if(node_pop.right!=null)
            {
                stack.push(node_pop.right);
            }
            if(node_pop.left!=null)
            {
                stack.push(node_pop.left);
            }
        }
        return list;
    }
}
