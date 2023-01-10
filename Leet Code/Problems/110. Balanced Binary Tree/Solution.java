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
    public boolean isBalanced(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        List<TreeNode> tree_list = new ArrayList<>(Arrays.asList(root));
        List<Integer> depth_height = new ArrayList<>(Arrays.asList(0));
        List<Integer> indx = new ArrayList<>(Arrays.asList(-1));
        int i=0;
        for(;i<tree_list.size();i++)
        {
            TreeNode pop_node=tree_list.get(i);
            if(pop_node!=null)
            {
                tree_list.addAll(Arrays.asList(pop_node.left,pop_node.right));
                depth_height.addAll(Arrays.asList(0,0));
                indx.addAll(Arrays.asList(i,i));
            }
        }
        for(i=tree_list.size()-1;i>=1;i--)
        {
            int previous_depth_value=depth_height.get(indx.get(i));
            int next_depth_value=depth_height.get(i)+1;
            depth_height.set(indx.get(i),
            Integer.max(previous_depth_value,next_depth_value));
            if(previous_depth_value!=0 && 
            Math.abs(previous_depth_value-next_depth_value)>1)
            {
                return false;
            }
        }
        return true;
    }
}
