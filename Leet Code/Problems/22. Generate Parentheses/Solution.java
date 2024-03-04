class Solution
{
    public List<String> generateParenthesis(int n)
    {
        if(n==1)
        {
            return Arrays.asList("()");
        }
        Set<String> set = new HashSet<>();
        for(String str : generateParenthesis(n-1))
        {
            StringBuilder sb = new StringBuilder(str);
            for(int i=0;i<=sb.length();i++)
            {
                if(i==sb.length() || sb.charAt(i)==')')
                {
                    sb.insert(i,'(');
                    for(int j=i;j<sb.length();j++)
                    {
                        if(sb.charAt(j)=='(')
                        {
                            sb.insert(j+1,')');
                            set.add(sb.toString());
                            sb.deleteCharAt(j+1);
                        }
                    }
                    sb.deleteCharAt(i);
                }
            }
        }
        return new LinkedList<>(set);
    }
}
