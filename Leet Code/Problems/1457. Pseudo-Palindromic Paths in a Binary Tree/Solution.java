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
    public int pseudoPalindromicPaths (TreeNode root)
    {
        int cnt=0;
        Queue<TreeNode> bfs = new LinkedList<>(){{add(root);}};
        Queue<Integer> bfs_freq = new LinkedList<>(){{add(1<<root.val);}};
        while(!bfs.isEmpty())
        {
            TreeNode node = bfs.remove();
            int freq = bfs_freq.remove();
            if(node.left==null && node.right==null)
            {
                if(Integer.bitCount(freq)<=1)
                {
                    cnt++;
                }
                continue;
            }
            if(node.left!=null)
            {
                bfs.add(node.left);
                bfs_freq.add(freq^(1<<node.left.val));
            }
            if(node.right!=null)
            {
                bfs.add(node.right);
                bfs_freq.add(freq^(1<<node.right.val));
            }
        }
        return cnt;
    }
}
