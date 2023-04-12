class Solution
{
    public String simplifyPath(String path)
    {
        Stack<String> stack = new Stack<>();
        for(String w : path.split("\\/+"))
        {
            if(w.equals("") || w.equals(".") || w.equals(".."))
            {
                if(w.equals("..") && !stack.empty())
                {
                    stack.pop();
                }
                continue;
            }
            stack.push(w);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty())
        {
            sb.insert(0,"/"+stack.pop());
        }
        return sb.length()==0?"/":sb.toString();
    }
}
