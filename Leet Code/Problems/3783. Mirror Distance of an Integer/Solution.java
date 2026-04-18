class Solution
{
    public int mirrorDistance(int n)
    {
        int r=0;
        for(int val=n;val>0;r=(r*10)+(val%10),val/=10);
        return Math.abs(n-r);
    }
}
