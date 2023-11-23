class Solution
{
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r)
    {
        List<Boolean> list = new ArrayList<>(l.length);
        for(int i=0;i<l.length;i++)
        {
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            Set<Integer> set = new HashSet<>();
            for(int indx=l[i];indx<=r[i];min=Integer.min(min,nums[indx]),max=Integer.max(max,nums[indx]),set.add(nums[indx++]));
            boolean flag=set.size()==1?true:(max-min)%(set.size()-1)==0;
            int d=set.size()==1?0:(max-min)/(set.size()-1);
            if(d>0)
            {
                flag=set.size()==r[i]-l[i]+1;
            }
            for(int k=min;flag && k<max;k+=d,flag=set.contains(k));
            list.add(flag);
        }
        return list;
    }
}
