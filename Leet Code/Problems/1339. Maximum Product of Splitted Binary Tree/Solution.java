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
    long total=0L;
    long mod=(long)(1e9+7);
    public int maxProduct(TreeNode root)
    {
        total=dfsSumMax(root)[0];
        return (int)(dfsSumMax(root)[1]%mod);
    }
    long[] dfsSumMax(TreeNode root)
    {
        if(root==null)
        {
            return new long[2];
        }
        long left[] = dfsSumMax(root.left);
        long right[] = dfsSumMax(root.right);
        long arr[] = new long[]{root.val+left[0]+right[0],LongStream.of(left[1], right[1], left[0]*(total-left[0]), right[0]*(total-right[0])).max().getAsLong()};
        return arr;
    }
}
