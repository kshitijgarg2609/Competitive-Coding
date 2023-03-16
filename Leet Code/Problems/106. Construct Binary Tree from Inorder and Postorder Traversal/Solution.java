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
    public TreeNode buildTree(int[] inorder, int[] postorder)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        TreeNode root = new TreeNode();
        Stack<TreeNode> stack = new Stack<>(){{push(root);}};
        Stack<int[]> stack_indx = new Stack<>(){{push(new int[]{0,inorder.length,0,postorder.length});}};
        while(!stack.empty())
        {
            TreeNode node = stack.pop();
            int arr[] = stack_indx.pop();
            node.val=postorder[arr[2]+arr[3]-1];
            int indx=map.get(node.val);
            int left=indx-arr[0];
            int right=arr[1]-left-1;
            if(left>0)
            {
                stack.push((node.left=new TreeNode()));
                stack_indx.push(new int[]{arr[0],left,arr[2],left});
            }
            if(right>0)
            {
                stack.push((node.right=new TreeNode()));
                stack_indx.push(new int[]{indx+1,right,arr[2]+((left<0)?0:left),right});
            }
        }
        return root;
    }
}
