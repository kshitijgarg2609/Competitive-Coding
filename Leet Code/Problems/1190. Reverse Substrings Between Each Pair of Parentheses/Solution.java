class Solution
{
    public String reverseParentheses(String s)
    {
        int pair[] = new int[s.length()];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else if(s.charAt(i)==')')
            {
                pair[i]=stack.pop();
                pair[pair[i]]=i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0,dir=1;i<s.length();i+=dir)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                i=pair[i];
                dir=-dir;
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
