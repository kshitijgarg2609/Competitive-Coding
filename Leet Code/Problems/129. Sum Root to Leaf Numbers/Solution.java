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
            System.out.println("pop_node="+pop_node.val+", "+pop_sum);
            if(pop_node.left==null && pop_node.right==null)
            {
                sum+=pop_sum;
                continue;
            }
            if(pop_node.left!=null)
            {
                qu.add(pop_node.left);
                qu_sum.add((pop_sum*10)+pop_node.left.val);
            }
            if(pop_node.right!=null)
            {
                qu.add(pop_node.right);
                qu_sum.add((pop_sum*10)+pop_node.right.val);
            }
        }
        return sum;
    }
}
