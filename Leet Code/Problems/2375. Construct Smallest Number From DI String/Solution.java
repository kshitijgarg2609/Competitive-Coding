class Solution
{
    public String smallestNumber(String pattern)
    {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<=pattern.length();i++)
        {
            st.push((char)(i+1+'0'));
            if(i==pattern.length() || pattern.charAt(i)=='I')
            {
                for(;!st.isEmpty();sb.append(st.pop()));
            }
        }
        return sb.toString();
    }
}
