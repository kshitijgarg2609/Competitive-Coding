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
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        List<List<Integer>> list = new LinkedList<>();
        for(TreeNode root : Arrays.asList(root1,root2))
        {
            List<Integer> leaves = new LinkedList<>();
            Stack<TreeNode> stack = new Stack<>();
            for(TreeNode ptr=root;ptr!=null || !stack.isEmpty();)
            {
                if(ptr!=null)
                {
                    stack.push(ptr);
                    ptr=ptr.left;
                }
                else if(!stack.isEmpty())
                {
                    ptr=stack.pop();
                    if(ptr.left==null && ptr.right==null)
                    {
                        leaves.add(ptr.val);
                    }
                    ptr=ptr.right;
                }
            }
            list.add(leaves);
        }
        return list.get(0).equals(list.get(1));
    }
}
