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
    public int maxAncestorDiff(TreeNode root)
    {
        int max=0;
        Queue<TreeNode> bfs = new LinkedList<>(){{add(root);}};
        Queue<int[]> min_max = new LinkedList<>(){{add(new int[]{root.val,root.val});}};
        while(!bfs.isEmpty())
        {
            TreeNode node = bfs.remove();
            int arr[] = min_max.remove();
            if(node.left==null && node.right==null)
            {
                max=Integer.max(max,arr[1]-arr[0]);
                continue;
            }
            for(TreeNode child : Arrays.asList(node.left,node.right).stream().filter(n->n!=null).collect(Collectors.toList()))
            {
                bfs.add(child);
                min_max.add(new int[]{Integer.min(arr[0],child.val),Integer.max(arr[1],child.val)});
            }
        }
        return max;
    }
}
