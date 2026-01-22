class Solution
{
    public int minimumPairRemoval(int[] nums)
    {
        int op=0;
        Map<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<nums.length;map.put(i,new int[]{i+1,nums[i++]}));
        map.get(nums.length-1)[0]=-1;
        for(;map.get(0)[0]!=-1;op++)
        {
            int cnt=0,min=Integer.MAX_VALUE,indx=-1,nxt=-1;
            for(int i=0,j=map.get(0)[0];j!=-1;i=j,j=map.get(i)[0])
            {
                if(map.get(i)[1]>map.get(j)[1])
                {
                    cnt++;
                }
                if((map.get(i)[1]+map.get(j)[1])<min)
                {
                    min=map.get(i)[1]+map.get(j)[1];
                    indx=i;
                    nxt=j;
                }
            }
            if(cnt==0)
            {
                break;
            }
            System.arraycopy(new int[]{map.get(nxt)[0],min},0,map.get(indx),0,2);
        }
        return op;
    }
}
