class Solution
{
    static final String map[] = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits)
    {
        List<String> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        if(digits.length()>0)
        {
            stack.push(0);
        }
        while(!stack.empty())
        {
            for(;stack.size()<digits.length();stack.push(0));
            String cmb = "";
            int indx=0;
            for(int x : stack)
            {
                cmb+=map[digits.charAt(indx++)-'0'].charAt(x);
            }
            list.add(cmb);
            for(;!stack.empty() && stack.peek()==map[digits.charAt(stack.size()-1)-'0'].length()-1;stack.pop());
            if(!stack.empty())
            {
                stack.push(stack.pop()+1);
            }
        }
        return list;
    }
}
