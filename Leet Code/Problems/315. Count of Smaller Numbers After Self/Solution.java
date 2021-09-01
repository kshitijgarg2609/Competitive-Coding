class Solution
{
    public List<Integer> countSmaller(int[] nums)
    {
      List<Integer> bin = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
      for(int i=0;i<nums.length;i++)
      {
        int indx=Collections.binarySearch(bin,nums[i]);
        int e=bin.get(indx);
        while(indx>0)
        {
          if(bin.get(indx)!=e)
          {
            break;
          }
          indx--;
        }
        if(bin.get(indx)!=e)
        {
          indx++;
        }
        bin.remove(indx);
        nums[i]=indx;
      }
      return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
}