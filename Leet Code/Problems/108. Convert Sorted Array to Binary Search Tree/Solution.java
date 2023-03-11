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
    public TreeNode sortedArrayToBST(int[] nums)
    {
        if(nums.length==0)
        {
            return null;
        }
        TreeNode root = new TreeNode(0);
        Stack<TreeNode> stack = new Stack<>(){{push(root);}};
        Stack<List<Integer>> stack_indx = new Stack<>(){{push(Arrays.asList(0,nums.length-1));}};
        while(!stack.empty())
        {
            TreeNode node_pop = stack.pop();
            List<Integer> indx_pop = stack_indx.pop();
            int mid=indx_pop.get(0)+((indx_pop.get(1)-indx_pop.get(0))/2);
            node_pop.val=nums[mid];
            if(mid>indx_pop.get(0))
            {
                stack.push((node_pop.left=new TreeNode(0)));
                stack_indx.push(Arrays.asList(indx_pop.get(0),mid-1));
            }
            if(mid<indx_pop.get(1))
            {
                stack.push((node_pop.right=new TreeNode(0)));
                stack_indx.push(Arrays.asList(mid+1,indx_pop.get(1)));
            }
        }
        return root;
    }
}
