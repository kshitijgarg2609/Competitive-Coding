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
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>(){{add(root);}};
        Queue<Integer> bfs_h = new LinkedList<>(){{add(0);}};
        while(!bfs.isEmpty())
        {
            TreeNode node = bfs.remove();
            int height = bfs_h.remove();
            if(node!=null)
            {
                if(list.size()==height)
                {
                    list.add(node.val);
                }
                else
                {
                    list.set(height,Integer.max(list.get(height),node.val));
                }
                bfs.add(node.left);
                bfs_h.add(height+1);
                bfs.add(node.right);
                bfs_h.add(height+1);
            }
        }
        return list;
    }
}
