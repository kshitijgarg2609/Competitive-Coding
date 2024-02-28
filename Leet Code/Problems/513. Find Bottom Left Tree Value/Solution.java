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
    public int findBottomLeftValue(TreeNode root)
    {
        int ans=root.val;
        Queue<TreeNode> bfs = new LinkedList<>(){{add(root);}};
        for(int size=0;!bfs.isEmpty();size=bfs.size())
        {
            ans=bfs.peek().val;
            while(size-->0)
            {
                TreeNode node = bfs.remove();
                if(node.left!=null)
                {
                    bfs.add(node.left);
                }
                if(node.right!=null)
                {
                    bfs.add(node.right);
                }
            }
        }
        return ans;
    }
}
