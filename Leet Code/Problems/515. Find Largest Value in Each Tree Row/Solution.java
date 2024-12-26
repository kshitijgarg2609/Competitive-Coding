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
    public List<Integer> largestValues(TreeNode root)
    {
        if(root==null)
        {
            return new LinkedList<>();
        }
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        while(!qu.isEmpty())
        {
            int max=Integer.MIN_VALUE;
            for(int i=0,size=qu.size();i<size;i++)
            {
                max=Integer.max(max,qu.peek().val);
                for(TreeNode node : new TreeNode[]{qu.peek().left,qu.remove().right})
                {
                    if(node!=null)
                    {
                        qu.add(node);
                    }
                }
            }
            list.add(max);
        }
        return list;
    }
}
