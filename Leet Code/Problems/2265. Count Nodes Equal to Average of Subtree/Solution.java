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
    public int averageOfSubtree(TreeNode root)
    {
        int cnt=0;
        Stack<TreeNode> dfs = new Stack<>(){{add(root);}};
        Stack<int[]> info_dfs = new Stack<>(){{add(new int[]{0,root.val,1});}};
        while(!dfs.empty())
        {
            TreeNode node = dfs.peek();
            int info[] = info_dfs.peek();
            if(info[0]==0 || info[0]==1)
            {
                node=(info[0]++==0)?node.left:node.right;
                if(node!=null)
                {
                    dfs.add(node);
                    info_dfs.add(new int[]{0,dfs.peek().val,1});
                }
            }
            else
            {
                node = dfs.pop();
                info = info_dfs.pop();
                if((info[1]/info[2])==node.val)
                {
                    cnt++;
                }
                if(!dfs.empty())
                {
                    info_dfs.peek()[1]+=info[1];
                    info_dfs.peek()[2]+=info[2];
                }
            }
        }
        return cnt;
    }
}
