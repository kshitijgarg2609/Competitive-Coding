class Solution
{
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens)
        {
            if(token.equals("+"))
            {
                stack.push(stack.pop()+stack.pop());
            }
            else if(token.equals("-"))
            {
                int b=stack.pop();
                stack.push(stack.pop()-b);
            }
            else if(token.equals("*"))
            {
                stack.push(stack.pop()*stack.pop());
            }
            else if(token.equals("/"))
            {
                int b=stack.pop();
                stack.push(stack.pop()/b);
            }
            else
            {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
