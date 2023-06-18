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
    public boolean isCousins(TreeNode root, int x, int y)
    {
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        Queue<Integer> qu_depth = new LinkedList<>(){{add(0);}};
        int xh=-1,yh=-1,xp=-1,yp=-1;
        while(!qu.isEmpty() && (xh==-1 || yh==-1))
        {
            TreeNode node = qu.remove();
            int depth = qu_depth.remove();
            if(node.left!=null)
            {
                qu.add(node.left);
                qu_depth.add(depth+1);
                if(node.left.val==x)
                {
                    xp=node.val;
                    xh=depth+1;
                }
                else if(node.left.val==y)
                {
                    yp=node.val;
                    yh=depth+1;
                }
            }
            if(node.right!=null)
            {
                qu.add(node.right);
                qu_depth.add(depth+1);
                if(node.right.val==x)
                {
                    xp=node.val;
                    xh=depth+1;
                }
                else if(node.right.val==y)
                {
                    yp=node.val;
                    yh=depth+1;
                }
            }
        }
        return xh==yh && xp!=yp;
    }
}
