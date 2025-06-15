class Solution
{
    public int maxDiff(int num)
    {
        int min=num,max=num;
        for(char x='0';x<='9';x=(char)(x+1))
        {
            for(char y='0';y<='9';y=(char)(y+1))
            {
                String n=Integer.toString(num).replace(x,y);
                if(n.charAt(0)=='0')
                {
                    continue;
                }
                max=Integer.max(max,Integer.parseInt(n));
                min=Integer.min(min,Integer.parseInt(n));
            }
        }
        return max-min;
    }
}
