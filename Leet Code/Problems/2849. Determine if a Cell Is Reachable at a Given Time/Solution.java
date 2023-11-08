class Solution
{
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t)
    {
        return !(Math.abs(sx-fx)==0 && Math.abs(sy-fy)==0 && t==1) && t>=Math.max(Math.abs(sx-fx),Math.abs(sy-fy));
    }
}
