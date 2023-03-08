class Solution
{
    public int minEatingSpeed(int[] piles, int h)
    {
        long left=1-1;
        long right=Arrays.stream(piles).max().getAsInt();
        while((right-left)>1)
        {
            long mid=(left+right+1)/2;
            long cnt=0;
            for(int x : piles)
            {
                long d=x;
                if(d%mid==0)
                {
                    cnt+=(d/mid);
                }
                else
                {
                    cnt+=(d/mid)+1;
                }
            }
            if(cnt<=h)
            {
                right=mid;
            }
            else
            {
                left=mid;
            }
        }
        return (int)right;
    }
}
