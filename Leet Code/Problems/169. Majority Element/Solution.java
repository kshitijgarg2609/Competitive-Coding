class Solution
{
    public int majorityElement(int[] nums)
    {
        int cnt=0;
        int sel=0;
        for(int x : nums)
        {
            if(cnt==0)
            {
                cnt++;
                sel=x;
            }
            else if(sel==x)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        return sel;
    }
}
