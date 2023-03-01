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
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<TreeNode> list_tree = new ArrayList<>();
        List<String> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        list_tree.add(root);
        list.add(String.valueOf(root.val));
        int i=0;
        while(list_tree.size()>0)
        {
            TreeNode tree_pop = list_tree.remove(0);
            String path_pop = list.get(i);
            if(tree_pop.left==null && tree_pop.right==null)
            {
                i++;
                continue;
            }
            if(tree_pop.left!=null)
            {
                list_tree.add(tree_pop.left);
                list.add(path_pop+"->"+tree_pop.left.val);
            }
            if(tree_pop.right!=null)
            {
                list_tree.add(tree_pop.right);
                list.add(path_pop+"->"+tree_pop.right.val);
            }
            list.remove(i);
        }
        return list;
    }
}
