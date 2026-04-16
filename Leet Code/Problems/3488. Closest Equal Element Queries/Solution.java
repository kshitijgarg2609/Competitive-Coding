class Solution
{
    public List<Integer> solveQueries(int[] nums, int[] queries)
    {
        int n=nums.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        int d[] = new int[n];
        for(int i=0;i<n;i++)
        {
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> l : map.values())
        {
            if(l.size()==1)
            {
                d[l.get(0)]=-1;
                continue;
            }
            for(int i=0;i<l.size();i++)
            {
                int leftD=(i==0)?(n-l.get(l.size()-1)+l.get(0)):(l.get(i)-l.get(i-1));
                int rightD=(i==l.size()-1)?(n-l.get(l.size()-1)+l.get(0)):(l.get(i+1)-l.get(i));
                d[l.get(i)]=Integer.min(leftD,rightD);
            }
        }
        return Arrays.stream(queries).mapToObj(q->Integer.valueOf(d[q])).toList();
    }
}
