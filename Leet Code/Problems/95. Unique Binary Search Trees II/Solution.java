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
    public List<TreeNode> generateTrees(int n)
    {
        return generateTrees(1,n);
    }
    public List<TreeNode> generateTrees(int left,int right)
    {
        if(left>right)
        {
            TreeNode emp = null;
            return Arrays.asList(emp);
        }
        List<TreeNode> list = new LinkedList<>();
        for(int mid=left;mid<=right;mid++)
        {
            List<TreeNode> left_list = generateTrees(left,mid-1);
            List<TreeNode> right_list = generateTrees(mid+1,right);
            for(TreeNode l : left_list)
            {
                for(TreeNode r : right_list)
                {
                    list.add(new TreeNode(mid,l,r));
                }
            }
        }
        return list;
    }
}
