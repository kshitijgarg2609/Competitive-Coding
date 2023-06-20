/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution
{
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target)
    {
        TreeNode ans=null;
        Queue<TreeNode> qu_o = new LinkedList<>(){{add(original);}};
        Queue<TreeNode> qu_c = new LinkedList<>(){{add(cloned);}};
        while(!qu_o.isEmpty())
        {
            TreeNode node_o=qu_o.remove();
            TreeNode node_c=qu_c.remove();
            if(node_o==target)
            {
                ans=node_c;
                break;
            }
            if(node_o.left!=null)
            {
                qu_o.add(node_o.left);
                qu_c.add(node_c.left);
            }
            if(node_o.right!=null)
            {
                qu_o.add(node_o.right);
                qu_c.add(node_c.right);
            }
        }
        return ans;
    }
}
