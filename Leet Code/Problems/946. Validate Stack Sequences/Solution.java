class Solution
{
    public boolean validateStackSequences(int[] pushed, int[] popped)
    {
        int j=0;
        Stack<Integer> stack = new Stack<>();
        for(int x : pushed)
        {
            stack.push(x);
            while(!stack.empty() && stack.peek().intValue()==popped[j])
            {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
