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
    public TreeNode reverseOddLevels(TreeNode root)
    {
        List<TreeNode> qu = new LinkedList<>(){{add(root);}};
        for(int lvl=1;!qu.isEmpty();lvl++)
        {
            List<TreeNode> nxt = new LinkedList<>();
            for(TreeNode node : qu)
            {
                for(TreeNode ch : new TreeNode[]{node.left,node.right})
                {
                    if(ch!=null)
                    {
                        nxt.add(ch);
                    }
                }
            }
            if(lvl%2==1)
            {
                for(int i=0,j=nxt.size()-1;i<j;i++,j--)
                {
                    int tmp=nxt.get(i).val;
                    nxt.get(i).val=nxt.get(j).val;
                    nxt.get(j).val=tmp;
                }
            }
            qu=nxt;
        }
        return root;
    }
}
