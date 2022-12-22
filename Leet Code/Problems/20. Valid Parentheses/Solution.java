class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case '(':
                case '[':
                case '{':
                {
                    stack.push(c);
                    break;
                }
                default:
                {
                    if(!stack.empty() && (
                    (stack.peek()=='(' && c==')') ||
                    (stack.peek()=='[' && c==']') ||
                    (stack.peek()=='{' && c=='}')
                    ))
                    {
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
