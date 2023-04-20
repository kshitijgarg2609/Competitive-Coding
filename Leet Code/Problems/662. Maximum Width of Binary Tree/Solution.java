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
    public int widthOfBinaryTree(TreeNode root)
    {
        long max_width=1;
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        Queue<Long> qu_node = new LinkedList<>(){{add(1L);}};
        int times=1;
        while(!qu.isEmpty())
        {
            int nxt_times=0;
            long min=0,max=0;
            for(int i=1;i<=times;i++)
            {
                TreeNode node = qu.remove();
                long node_number = qu_node.remove();
                if(i==1)
                {
                    min=max=node_number;
                }
                else
                {
                    max=node_number;
                }
                if(node.left!=null)
                {
                    qu.add(node.left);
                    qu_node.add((2*node_number));
                    nxt_times++;
                }
                if(node.right!=null)
                {
                    qu.add(node.right);
                    qu_node.add((2*node_number)+1);
                    nxt_times++;
                }
            }
            max_width=Long.max(max_width,(max-min+1));
            times=nxt_times;
        }
        return (int)max_width;
    }
}
