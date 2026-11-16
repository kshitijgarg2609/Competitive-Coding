class Solution
{
    public String digitSum(String s, int k)
    {
        if(s.length()<=k)
        {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k)
        {
            sb.append(IntStream.range(i,Integer.min(i+k,s.length())).map(in->s.charAt(in)-'0').sum());
        }
        return digitSum(sb.toString(), k);
    }
}
