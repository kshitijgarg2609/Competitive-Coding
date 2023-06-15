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
    public int maxLevelSum(TreeNode root)
    {
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        int times=1;
        int max=Integer.MIN_VALUE;
        int lvl=1;
        int ans=1;
        while(!qu.isEmpty())
        {
            int nxt_times=0;
            int sum=0;
            for(int i=0;i<times;i++)
            {
                TreeNode node = qu.remove();
                sum+=node.val;
                if(node.left!=null)
                {
                    qu.add(node.left);
                    nxt_times++;
                }
                if(node.right!=null)
                {
                    qu.add(node.right);
                    nxt_times++;
                }
            }
            if(sum>max)
            {
                max=sum;
                ans=lvl;
            }
            times=nxt_times;
            lvl++;
        }
        return ans;
    }
}
