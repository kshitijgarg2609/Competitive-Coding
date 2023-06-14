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
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode ptr1=root1;
        TreeNode ptr2=root2;
        while(ptr1!=null || !stack1.empty() || ptr2!=null || !stack2.empty())
        {
            if(ptr1!=null)
            {
                stack1.push(ptr1);
                ptr1=ptr1.left;
            }
            else if(!stack1.empty())
            {
                ptr1=stack1.pop();
                if(ptr1.left==null && ptr1.right==null)
                {
                    list1.add(ptr1.val);
                }
                ptr1=ptr1.right;
            }
            if(ptr2!=null)
            {
                stack2.push(ptr2);
                ptr2=ptr2.left;
            }
            else if(!stack2.empty())
            {
                ptr2=stack2.pop();
                if(ptr2.left==null && ptr2.right==null)
                {
                    list2.add(ptr2.val);
                }
                ptr2=ptr2.right;
            }
        }
        return list1.equals(list2);
    }
}
