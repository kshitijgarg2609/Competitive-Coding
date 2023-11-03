class Solution
{
    public List<String> buildArray(int[] target, int n)
    {
        List<String> list = new LinkedList<>();
        for(int i=1,t=0;i<=n && t<target.length;i++)
        {
            if(i==target[t])
            {
                list.add("Push");
                t++;
            }
            else
            {
                list.addAll(Arrays.asList("Push","Pop"));
            }
        }
        return list;
    }
}
