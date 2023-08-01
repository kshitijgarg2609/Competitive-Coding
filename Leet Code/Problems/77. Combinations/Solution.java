class Solution
{
    public List<List<Integer>> combine(int n, int k)
    {
        Stack<Integer> stack = new Stack<>(){{push(1);}};
        List<List<Integer>> list = new LinkedList<>();
        while(!stack.empty())
        {
            for(;!stack.empty() && stack.size()<k;stack.push(stack.peek()+1));
            if(stack.size()==k)
            {
                list.add(new LinkedList<>(stack));
            }
            for(int lst=n;!stack.empty() && stack.peek()==lst;stack.pop(),lst--);
            if(!stack.empty())
            {
                stack.push(stack.pop()+1);
            }
        }
        return list;
    }
}
