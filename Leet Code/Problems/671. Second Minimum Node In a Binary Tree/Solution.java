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
    public int findSecondMinimumValue(TreeNode root)
    {
        List<Long> list = new ArrayList<>(Arrays.asList(Long.MAX_VALUE,Long.MAX_VALUE));
        Queue<TreeNode> qu = new LinkedList<>(Arrays.asList(root));
        while(!qu.isEmpty())
        {
            TreeNode node=qu.remove();
            if(node.val>list.get(0) && node.val<list.get(1))
            {
                list.set(1,Long.valueOf(node.val));
            }
            else if(node.val<list.get(0))
            {
                list.remove(1);
                list.add(0,Long.valueOf(node.val));
            }
            if(node.left!=null)
            {
                qu.add(node.left);
            }
            if(node.right!=null)
            {
                qu.add(node.right);
            }
        }
        return (list.get(1)==Long.MAX_VALUE)?-1:list.get(1).intValue();
    }
}
