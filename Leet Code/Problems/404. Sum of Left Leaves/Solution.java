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
    public int sumOfLeftLeaves(TreeNode root)
    {
        List<TreeNode> list = new ArrayList<>(Arrays.asList(root));
        int cnt=0;
        while(list.size()>0)
        {
            TreeNode pop = list.remove(0);
            if(pop.left!=null)
            {
                list.add(pop.left);
                if(pop.left.left==null && pop.left.right==null)
                {
                    cnt+=pop.left.val;
                }
            }
            if(pop.right!=null)
            {
                list.add(pop.right);
            }
        }
        return cnt;
    }
}
