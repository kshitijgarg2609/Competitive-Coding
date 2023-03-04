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
    public boolean isSubtree(TreeNode root, TreeNode subRoot)
    {
        List<TreeNode> trav_list = new ArrayList<>(Arrays.asList(root));
        while(trav_list.size()>0)
        {
            TreeNode pop_node = trav_list.remove(0);
            if(pop_node.val==subRoot.val)
            {
                boolean identical=true;
                List<TreeNode> list1 = new ArrayList<>(Arrays.asList(pop_node));
                List<TreeNode> list2 = new ArrayList<>(Arrays.asList(subRoot));
                while(list1.size()>0)
                {
                    TreeNode pop_node1=list1.remove(0);
                    TreeNode pop_node2=list2.remove(0);
                    if(pop_node1==null && pop_node2==null)
                    {
                        continue;
                    }
                    else if(pop_node1==null || pop_node2==null || pop_node1.val!=pop_node2.val)
                    {
                        identical=false;
                        break;
                    }
                    list1.addAll(Arrays.asList(pop_node1.left,pop_node1.right));
                    list2.addAll(Arrays.asList(pop_node2.left,pop_node2.right));
                }
                if(identical)
                {
                    return true;
                }
            }
            if(pop_node.left!=null)
            {
                trav_list.add(pop_node.left);
            }
            if(pop_node.right!=null)
            {
                trav_list.add(pop_node.right);
            }
        }
        return false;
    }
}
