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
    public long kthLargestLevelSum(TreeNode root, int k)
    {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        while(!qu.isEmpty())
        {
            long sum=0,len=qu.size();
            for(int i=0;i<len;i++)
            {
                TreeNode pop = qu.remove();
                sum+=pop.val;
                if(pop.left!=null)
                {
                    qu.add(pop.left);
                }
                if(pop.right!=null)
                {
                    qu.add(pop.right);
                }
            }
            if(sum>0L)
            {
                pq.add(sum);
            }
        }
        while(!pq.isEmpty())
        {
            long pop=pq.remove();
            if(--k==0)
            {
                return pop;
            }
        }
        return -1L;
    }
}
