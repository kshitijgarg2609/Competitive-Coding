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
    public TreeNode recoverFromPreorder(String traversal)
    {
        TreeNode root = null, t=null;
        Stack<TreeNode> node = new Stack<>();
        Stack<Integer> h = new Stack<>();
        for(int i=0;i<traversal.length();)
        {
            int dash=0,value=0;
            for(;i<traversal.length() && traversal.charAt(i)=='-';i++,dash++);
            for(;i<traversal.length() && Character.isDigit(traversal.charAt(i));value=(value*10)+traversal.charAt(i++)-'0');
            if(dash==0)
            {
                root=new TreeNode(value);
                node.push(root);
                h.push(dash);
                continue;
            }
            for(;dash<h.peek();node.pop(),h.pop());
            if(dash!=h.peek())
            {
                t=node.peek().left=new TreeNode(value);
            }
            else
            {
                node.pop();
                h.pop();
                t=node.peek().right=new TreeNode(value);
            }
            node.push(t);
            h.push(dash);
        }
        return root;
    }
}
