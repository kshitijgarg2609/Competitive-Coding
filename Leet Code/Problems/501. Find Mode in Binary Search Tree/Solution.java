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
    public int[] findMode(TreeNode root)
    {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        int max_freq=0;
        while(!qu.isEmpty())
        {
            TreeNode node=qu.remove();
            map.put(node.val,map.getOrDefault(node.val,0)+1);
            max_freq=Integer.max(max_freq,map.get(node.val));
            if(node.left!=null)
            {
                qu.add(node.left);
            }
            if(node.right!=null)
            {
                qu.add(node.right);
            }
        }
        List<Integer> list = new LinkedList<>();
        for(Map.Entry<Integer,Integer> ent : map.entrySet())
        {
            if(ent.getValue().intValue()==max_freq)
            {
                list.add(ent.getKey());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
