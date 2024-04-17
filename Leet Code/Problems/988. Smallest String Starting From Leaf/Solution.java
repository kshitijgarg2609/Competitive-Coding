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
    public String smallestFromLeaf(TreeNode root)
    {
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        smallestFromLeaf(root,pq,new StringBuilder());
        return pq.remove();
    }
    public void smallestFromLeaf(TreeNode root,PriorityQueue<String> pq,StringBuilder sb)
    {
        sb.insert(0,(char)('a'+root.val));
        if(root.left!=null)
        {
            smallestFromLeaf(root.left,pq,sb);
        }
        if(root.right!=null)
        {
            smallestFromLeaf(root.right,pq,sb);
        }
        if(root.left==null && root.right==null)
        {
            pq.add(sb.toString());
            if(pq.size()>1)
            {
                pq.remove();
            }
        }
        sb.deleteCharAt(0);
    }
}
