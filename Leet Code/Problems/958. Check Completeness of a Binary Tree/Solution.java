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
    public boolean isCompleteTree(TreeNode root)
    {
        List<TreeNode> list = new ArrayList<>(){{add(root);}};
        boolean null_flag=false;
        while(list.size()>0)
        {
            TreeNode node_pop = list.remove(0);
            if(node_pop==null)
            {
                null_flag=true;
                continue;
            }
            if(null_flag && node_pop!=null)
            {
                return false;
            }
            list.addAll(Arrays.asList(node_pop.left,node_pop.right));
        }
        return true;
    }
}
