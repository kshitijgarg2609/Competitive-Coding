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
    public boolean findTarget(TreeNode root, int k)
    {
        List<TreeNode> list_tree = new ArrayList<>(Arrays.asList(root));
        while(list_tree.size()>0)
        {
            TreeNode node_pop = list_tree.remove(0);
            if(node_pop!=null)
            {
                int find=k-node_pop.val;
                TreeNode ptr=root;
                while(ptr!=null)
                {
                    if(ptr.val>find)
                    {
                        ptr=ptr.left;
                    }
                    else if(ptr.val<find)
                    {
                        ptr=ptr.right;
                    }
                    else if(node_pop.val!=ptr.val)
                    {
                        return true;
                    }
                    else
                    {
                        ptr=(ptr.val>find)?ptr.left:ptr.right;
                    }
                }
                list_tree.addAll(Arrays.asList(node_pop.left,node_pop.right));
            }
        }
        return false;
    }
}
