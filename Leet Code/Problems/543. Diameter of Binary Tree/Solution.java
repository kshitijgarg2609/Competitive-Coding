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
    public int diameterOfBinaryTree(TreeNode root)
    {
        List<TreeNode> tree_list = new ArrayList<>(Arrays.asList(root));
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-1,1,1));
        int dia=0;
        for(int i=0;i<list.size();i++)
        {
            TreeNode pop_node = tree_list.remove(0);
            List<Integer> pop_node_list = list.get(i);
            if(pop_node.left!=null)
            {
                tree_list.add(pop_node.left);
                list.add(Arrays.asList(i,pop_node_list.get(1)+1,1));
            }
            if(pop_node.right!=null)
            {
                tree_list.add(pop_node.right);
                list.add(Arrays.asList(i,pop_node_list.get(1)+1,1));
            }
        }
        for(int i=list.size()-1;i>=1;i--)
        {
            List<Integer> node = list.get(i);
            List<Integer> parent_node = list.get(node.get(0));
            dia=Integer.max(dia,node.get(2)+parent_node.get(2)-1);
            parent_node.set(2,Integer.max(node.get(2)+1,parent_node.get(2)));
        }
        return dia;
    }
}
