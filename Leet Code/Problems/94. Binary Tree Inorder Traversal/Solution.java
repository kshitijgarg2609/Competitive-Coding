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
    public List<Integer> inorderTraversal(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
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
        return list;         
    }
}
