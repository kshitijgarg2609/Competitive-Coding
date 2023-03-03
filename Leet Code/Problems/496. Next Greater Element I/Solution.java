class Solution
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int x : nums2)
        {
            while(!stack.empty() && x>stack.peek())
            {
                map.put(stack.pop(),x);
            }
            stack.push(x);
        }
        while(!stack.empty())
        {
            map.put(stack.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}
