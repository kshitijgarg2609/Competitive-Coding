class Solution
{
    public int subsetXORSum(int[] nums)
    {
        int cnt=0;
        for(int i=1;i<(1<<nums.length);i++)
        {
            int sub_cnt=0;
            String bin = Integer.toBinaryString(i);
            for(int j=nums.length-1,k=bin.length()-1;k>=0;k--,j--)
            {
                if(bin.charAt(k)=='1')
                {
                    sub_cnt^=nums[j];
                }
            }
            cnt+=sub_cnt;
        }
        return cnt;
    }
}
