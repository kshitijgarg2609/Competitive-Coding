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
    public TreeNode createBinaryTree(int[][] descriptions)
    {
        Map<Integer,TreeNode> map = new HashMap<>();
        for(int node[] : descriptions)
        {
            map.putIfAbsent(node[0],new TreeNode(node[0]));
            map.putIfAbsent(node[1],new TreeNode(node[1]));
            if(node[2]==1)
            {
                map.get(node[0]).left=map.get(node[1]);
            }
            else if(node[2]==0)
            {
                map.get(node[0]).right=map.get(node[1]);
            }
        }
        TreeNode root = null;
        while(map.size()>0)
        {
            Map.Entry<Integer,TreeNode> ent = map.entrySet().iterator().next();
            Queue<Integer> qu = new LinkedList<>(){{add(ent.getKey());}};
            while(!qu.isEmpty())
            {
                TreeNode node = map.remove(qu.remove());
                if(node!=null)
                {
                    if(node.left!=null)
                    {
                        qu.add(node.left.val);
                    }
                    if(node.right!=null)
                    {
                        qu.add(node.right.val);
                    }
                }
            }
            if(map.size()==0)
            {
                root=ent.getValue();
            }
        }
        return root;
    }
}
