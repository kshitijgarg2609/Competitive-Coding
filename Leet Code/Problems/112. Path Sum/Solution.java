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
    public boolean hasPathSum(TreeNode root, int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        List<TreeNode> tree_list = new ArrayList<>(Arrays.asList(root));
        List<Integer> sum_list = new ArrayList<>(Arrays.asList(root.val));
        while(!tree_list.isEmpty())
        {
            TreeNode node_pop=tree_list.remove(0);
            int current_sum=sum_list.remove(0);
            boolean left_flag=true;
            boolean right_flag=true;
            if(node_pop.left!=null)
            {
                tree_list.add(node_pop.left);
                sum_list.add(node_pop.left.val+current_sum);
                left_flag=false;
            }
            if(node_pop.right!=null)
            {
                tree_list.add(node_pop.right);
                sum_list.add(node_pop.right.val+current_sum);
                right_flag=false;
            }
            if(left_flag && right_flag && current_sum==targetSum)
            {
                return true;
            }
        }
        return false;
    }
}
