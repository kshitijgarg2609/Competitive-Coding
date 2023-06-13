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
    public int minDiffInBST(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode ptr=root;
        while(ptr!=null || !stack.empty())
        {
            if(ptr!=null)
            {
                stack.push(ptr);
                ptr=ptr.left;
            }
            else
            {
                ptr=stack.pop();
                list.add(ptr.val);
                ptr=ptr.right;
            }
        }
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++)
        {
            diff=Integer.min(diff,list.get(i)-list.get(i-1));
        }
        return diff;
    }
}
