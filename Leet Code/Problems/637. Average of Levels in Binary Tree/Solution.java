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
    public List<Double> averageOfLevels(TreeNode root)
    {
        List<Double> list = new ArrayList<>();
        List<TreeNode> list_node = new ArrayList<>(Arrays.asList(root));
        while(list_node.size()>0)
        {
            double sum=0;
            int cnt=0;
            List<TreeNode> list_child = new ArrayList<>();
            for(TreeNode node : list_node)
            {
                if(node!=null)
                {
                    sum+=node.val;
                    cnt++;
                    list_child.add(node.left);
                    list_child.add(node.right);
                }
            }
            list_node.clear();
            list_node.addAll(list_child);
            if(cnt>0)
            {
                list.add(new Double(sum/cnt));
            }
        }
        return list;
    }
}
