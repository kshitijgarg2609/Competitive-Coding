class Solution
{
    public int mySqrt(int x)
    {
        if(x==0 || x==1)
        {
            return x;
        }
        long left=1;
        long right=x;
        long ans=-1;
        while(left<=right)
        {
            long mid=(left+right)/2;
            long square=mid*mid;
            long next_square=(mid+1)*(mid+1);
            if(square<=x && next_square>x)
            {
                ans=mid;
                break;
            }
            else if(square>x)
            {
                right=mid-1;
            }
            else if(square<x && next_square<=x)
            {
                left=mid+1;
            }
        }
        return (int)ans;
    }
}
