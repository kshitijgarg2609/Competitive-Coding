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
    public boolean isEvenOddTree(TreeNode root)
    {
        Queue<TreeNode> bfs = new LinkedList<>(){{add(root);}};
        for(int size=1,lvl=0;!bfs.isEmpty();size=bfs.size(),lvl++)
        {
            for(int curr=(lvl%2==0)?Integer.MIN_VALUE:Integer.MAX_VALUE;size-->0;)
            {
                TreeNode node = bfs.remove();
                if((lvl%2==0 && (node.val%2==0 || curr>=node.val)) || (lvl%2==1 && (node.val%2==1 || curr<=node.val)))
                {
                    return false;
                }
                curr=node.val;
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
        return true;
    }
}
