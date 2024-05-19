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
    public int distributeCoins(TreeNode root)
    {
        AtomicInteger moves = new AtomicInteger();
        distributeCoins(root,moves);
        return moves.get();
    }
    public int distributeCoins(TreeNode root,AtomicInteger moves)
    {
        if(root==null)
        {
            return 0;
        }
        int l=distributeCoins(root.left,moves);
        int r=distributeCoins(root.right,moves);
        moves.set(moves.get()+Math.abs(l)+Math.abs(r));
        return root.val-1+l+r;
    }
}
