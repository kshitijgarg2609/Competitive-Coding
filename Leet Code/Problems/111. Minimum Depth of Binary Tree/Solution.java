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
    public int minDepth(TreeNode root)
    {
        List<TreeNode> tree_list = new ArrayList<>(Arrays.asList(root));
        List<Integer> depth_list = new ArrayList<>(Arrays.asList(1));
        int ans=0;
        while(!tree_list.isEmpty())
        {
            TreeNode node_pop=tree_list.remove(0);
            int depth=depth_list.remove(0);
            if(node_pop!=null)
            {
                boolean left_flag=true;
                boolean right_flag=true;
                if(node_pop.left!=null)
                {
                    tree_list.add(node_pop.left);
                    depth_list.add(depth+1);
                    left_flag=false;
                }
                if(node_pop.right!=null)
                {
                    tree_list.add(node_pop.right);
                    depth_list.add(depth+1);
                    right_flag=false;
                }
                if(left_flag && right_flag)
                {
                    ans=depth;
                    break;
                }
            }
        }
        return ans;
    }
}
