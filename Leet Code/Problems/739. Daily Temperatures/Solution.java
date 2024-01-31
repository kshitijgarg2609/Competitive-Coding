class Solution
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        int ans[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++)
        {
            for(;!stack.empty() && temperatures[i]>temperatures[stack.peek()];ans[stack.peek()]=i-stack.pop());
            stack.push(i);
        }
        return ans;
    }
}
