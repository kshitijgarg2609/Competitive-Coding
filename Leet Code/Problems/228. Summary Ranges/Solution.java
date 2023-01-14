class Solution
{
    public List<String> summaryRanges(int[] nums)
    {
        int start_num,stop_num;
        boolean start_stop_flag=true;
        List<String> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            stop_num=start_num=nums[i++];
            while(i<nums.length && (nums[i]-stop_num)==1)
            {
                stop_num=nums[i];
                i++;
            }
            i--;
            if(start_num!=stop_num)
            {
                list.add(String.format("%d->%d",start_num,stop_num));
            }
            else
            {
                list.add(String.format("%d",start_num));
            }
        }
        return list;
    }
}
