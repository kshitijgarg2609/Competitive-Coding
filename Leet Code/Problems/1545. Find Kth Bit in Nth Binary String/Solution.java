class Solution
{
    public char findKthBit(int n, int k)
    {
        if(n==1)
        {
            return '0';
        }
        int len=(int)(Math.pow(2,n)-1),mid=(len/2);
        if(k-1<mid)
        {
            return findKthBit(n-1,k);
        }
        else if(k-1>mid)
        {
            return (char)(((findKthBit(n-1,len-k+1)-'0'+1)%2)+'0');
        }
        return '1';
    }
}
