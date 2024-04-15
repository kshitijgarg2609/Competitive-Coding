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
    public int sumNumbers(TreeNode root)
    {
        int sum=0;
        Queue<TreeNode> qu = new ArrayDeque<>(){{add(root);}};
        Queue<Integer> qu_sum = new ArrayDeque<>(){{add(root.val);}};
        while(!qu.isEmpty())
        {
            TreeNode pop_node = qu.remove();
            Integer pop_sum = qu_sum.remove();
            if(pop_node.left==null && pop_node.right==null)
            {
                sum+=pop_sum;
                continue;
            }
            for(TreeNode pop_child : Arrays.asList(pop_node.left,pop_node.right).stream().filter(n->n!=null).toArray(TreeNode[]::new))
            {
                qu.add(pop_child);
                qu_sum.add((pop_sum*10)+pop_child.val);
            }
        }
        return sum;
    }
}
