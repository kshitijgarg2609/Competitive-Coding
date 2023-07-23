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
    public List<TreeNode> allPossibleFBT(int n)
    {
        Map<Integer,List<TreeNode>> map = new HashMap<>(){{put(1,Arrays.asList(new TreeNode(0)));}};
        if(n%2==0)
        {
            return new LinkedList<>();
        }
        for(int node=3;node<=n;node+=2)
        {
            List<TreeNode> list = new LinkedList<>();
            for(int root_point=2;root_point<=node;root_point+=2)
            {
                List<TreeNode> left = map.get(root_point-1);
                List<TreeNode> right = map.get(node-root_point);
                for(TreeNode l : left)
                {
                    for(TreeNode r : right)
                    {
                        list.add(new TreeNode(0,l,r));
                    }
                }
            }
            map.put(node,list);
        }
        return map.get(n);
    }
}
