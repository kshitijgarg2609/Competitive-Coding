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
    public int amountOfTime(TreeNode root, int start)
    {
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        Map<Integer,Set<Integer>> map = new HashMap<>();
        while(!qu.isEmpty())
        {
            TreeNode node = qu.remove();
            for(TreeNode child : Stream.of(node.left,node.right).filter(n->n!=null).collect(Collectors.toList()))
            {
                map.computeIfAbsent(node.val,k->new HashSet<>()).add(child.val);
                map.computeIfAbsent(child.val,k->new HashSet<>()).add(node.val);
                qu.add(child);
            }
        }
        int max=0;
        for(Set<Integer> set = new HashSet<>(){{add(start);}};map.size()>0;max+=set.size()!=0?1:0)
        {
            set=set.stream().flatMap(n->map.remove(n).stream().filter(f->map.containsKey(f))).collect(Collectors.toSet());
            
        }
        return max;
    }
}
