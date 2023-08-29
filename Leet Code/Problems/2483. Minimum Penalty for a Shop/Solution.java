class Solution
{
    public int bestClosingTime(String customers)
    {
        int h=0;
        for(int i=0,min=0,cnt=0;i<customers.length();i++)
        {
            cnt+=(customers.charAt(i)=='Y')?-1:1;
            if(cnt<min)
            {
                min=cnt;
                h=i+1;
            }
        }
        return h;
    }
}
