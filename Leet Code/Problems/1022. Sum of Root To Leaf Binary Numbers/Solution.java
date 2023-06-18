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
    public int sumRootToLeaf(TreeNode root)
    {
        int sum=0;
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        Queue<Integer> qu_bits = new LinkedList<>(){{add(root.val);}};
        while(!qu.isEmpty())
        {
            TreeNode node = qu.remove();
            int decimal = qu_bits.remove();
            if(node.left==null && node.right==null)
            {
                sum+=decimal;
                continue;
            }
            if(node.left!=null)
            {
                qu.add(node.left);
                qu_bits.add((decimal<<1)+node.left.val);
            }
            if(node.right!=null)
            {
                qu.add(node.right);
                qu_bits.add((decimal<<1)+node.right.val);
            }
        }
        return sum;
    }
}
