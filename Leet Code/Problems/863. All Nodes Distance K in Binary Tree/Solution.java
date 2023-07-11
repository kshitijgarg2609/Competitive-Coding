/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
    {
        Map<TreeNode,List<TreeNode>> adj = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        while(!qu.isEmpty())
        {
            TreeNode pop = qu.remove();
            if(pop.left!=null)
            {
                qu.add(pop.left);
                adj.computeIfAbsent(pop,key->new ArrayList<>()).add(pop.left);
                adj.computeIfAbsent(pop.left,key->new ArrayList<>()).add(pop);
            }
            if(pop.right!=null)
            {
                qu.add(pop.right);
                adj.computeIfAbsent(pop,key->new ArrayList<>()).add(pop.right);
                adj.computeIfAbsent(pop.right,key->new ArrayList<>()).add(pop);
            }
        }
        qu.add(target);
        Queue<Integer> qu_d = new LinkedList<>(){{add(0);}};
        List<Integer> list = new LinkedList<>();
        while(!qu.isEmpty())
        {
            TreeNode node = qu.remove();
            int d = qu_d.remove();
            if(d==k)
            {
                list.add(node.val);
            }
            if(!adj.containsKey(node))
            {
                continue;
            }
            if(!adj.containsKey(node))
            {
                continue;
            }
            for(TreeNode c : adj.remove(node))
            {
                if(adj.containsKey(c))
                {
                    qu.add(c);
                    qu_d.add(d+1);
                }
            }
        }
        return list;
    }
}
