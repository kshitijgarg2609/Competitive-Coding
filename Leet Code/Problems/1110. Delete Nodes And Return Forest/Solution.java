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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete)
    {
        List<TreeNode> list = new LinkedList<>();
        Set<Integer> set = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        Queue<TreeNode> qu = new LinkedList<>(){{add(root);}};
        if(!set.contains(root.val))
        {
            list.add(root);
        }
        while(!qu.isEmpty())
        {
            TreeNode node = qu.remove();
            if(node.left!=null)
            {
                qu.add(node.left);
                if(set.contains(node.left.val))
                {
                    node.left=null;
                }
            }
            if(node.right!=null)
            {
                qu.add(node.right);
                if(set.contains(node.right.val))
                {
                    node.right=null;
                }
            }
            if(set.contains(node.val))
            {
                if(node.left!=null)
                {
                    list.add(node.left);
                }
                if(node.right!=null)
                {
                    list.add(node.right);
                }
            }
        }
        return list;
    }
}
