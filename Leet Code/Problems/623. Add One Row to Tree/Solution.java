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
    public TreeNode addOneRow(TreeNode root, int val, int depth)
    {
        if(depth==1)
        {
            root=new TreeNode(val,root,null);
        }
        else
        {
            Queue<TreeNode> bfs = new LinkedList<>();
            bfs.add(root);
            Queue<Integer> bfs_dep = new LinkedList<>(){{add(1);}};
            while(!bfs.isEmpty())
            {
                TreeNode node = bfs.remove();
                int dep = bfs_dep.remove();
                if(dep==depth-1)
                {
                    node.left=new TreeNode(val,node.left,null);
                    node.right=new TreeNode(val,null,node.right);
                    continue;
                }
                if(node.left!=null)
                {
                    bfs.add(node.left);
                    bfs_dep.add(dep+1);
                }
                if(node.right!=null)
                {
                    bfs.add(node.right);
                    bfs_dep.add(dep+1);   
                }
            }
        }
        return root;
    }
}
