class Solution
{
    public int maxScore(String s)
    {
        int max=0;
        for(int i=0,z=0,o=(int)s.chars().filter(b->b=='1').count();i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                z++;
            }
            else
            {
                o--;
            }
            max=Integer.max(max,z+o);
        }
        return max;
    }
}
