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
    public String getDirections(TreeNode root, int startValue, int destValue)
    {
        Map<Integer,List<int[]>> map = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        while(!qu.isEmpty())
        {
            TreeNode node = qu.remove();
            if(node.left!=null)
            {
                qu.add(node.left);
                map.computeIfAbsent(node.val,k->new ArrayList<>()).add(new int[]{node.left.val,'L'});
                map.computeIfAbsent(node.left.val,k->new ArrayList<>()).add(new int[]{node.val,'U'});
            }
            if(node.right!=null)
            {
                qu.add(node.right);
                map.computeIfAbsent(node.val,k->new ArrayList<>()).add(new int[]{node.right.val,'R'});
                map.computeIfAbsent(node.right.val,k->new ArrayList<>()).add(new int[]{node.val,'U'});
            }
        }
        StringBuilder sb = new StringBuilder();
        getDirections(map,startValue,destValue,sb);
        return sb.toString();
    }
    boolean getDirections(Map<Integer,List<int[]>> map, int startValue, int destValue, StringBuilder path)
    {
        if(!map.containsKey(startValue) || startValue==destValue)
        {
            return (startValue==destValue);
        }
        for(int adj[] : map.remove(startValue))
        {
            path.append((char)(adj[1]));
            if(getDirections(map,adj[0],destValue,path))
            {
                return true;
            }
            path.deleteCharAt(path.length()-1);
        }
        return false;
    }
}
