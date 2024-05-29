class Solution
{
    public int numSteps(String s)
    {
        int cnt=0;
        StringBuilder sb = new StringBuilder(s);
        for(;sb.length()!=1;cnt++)
        {
            if(sb.charAt(sb.length()-1)=='1')
            {
                int zero=sb.lastIndexOf("0");
                if(zero>=0)
                {
                    sb.setCharAt(zero++,'1');
                }
                else
                {
                    sb.insert(0,'1');
                    zero=1;
                }
                for(int i=zero;i<sb.length();sb.setCharAt(i++,'0'));
            }
            else
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return cnt;
    }
}
