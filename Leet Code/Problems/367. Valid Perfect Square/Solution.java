class Solution
{
    public boolean isPerfectSquare(int num)
    {
        if(num==1)
        {
            return true;
        }
        long left=1;
        long right=num;
        while(left<right)
        {
            long mid=(left+right)/2;
            long square=mid*mid;
            long next_square=(mid+1)*(mid+1);
            if(num==square || num==next_square)
            {
                return true;
            }
            else if(square<num && next_square<num)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}
