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
    public int minimumOperations(TreeNode root)
    {
        int cnt=0;
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        while(!qu.isEmpty())
        {
            List<int[]> list = new LinkedList<>();
            for(int i=0,j=0,size=qu.size();i<size;i++)
            {
                for(TreeNode n : new TreeNode[]{qu.peek().left,qu.remove().right})
                {
                    if(n!=null)
                    {
                        qu.add(n);
                        list.add(new int[]{j++,n.val});
                    }
                }
            }
            Collections.sort(list,(i,j)->Integer.compare(i[1],j[1]));
            boolean vis[] = new boolean[list.size()];
            for(int i=0;i<list.size();i++)
            {
                if(vis[i] || list.get(i)[0]==i)
                {
                    continue;
                }
                int c=0;
                for(int j=i;!vis[j];vis[j]=true,j=list.get(j)[0],c++);
                cnt+=c-1;
            }
        }
        return cnt;
    }
}
