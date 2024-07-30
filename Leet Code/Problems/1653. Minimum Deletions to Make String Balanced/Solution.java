class Solution
{
    public int minimumDeletions(String s)
    {
        int cnt=0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(!stack.empty() && stack.peek()=='b' && c=='a')
            {
                stack.pop();
                cnt++;
                continue;
            }
            stack.push(c);
        }
        return cnt;
    }
}
