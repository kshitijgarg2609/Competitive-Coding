class Solution
{
    public List<List<Integer>> largeGroupPositions(String s)
    {
        List<List<Integer>> list = new LinkedList<>();
        for(int i=0;i<s.length();)
        {
            int start=i;
            for(i++;i<s.length() && s.charAt(i)==s.charAt(i-1);i++);
            if((i-start)>=3)
            {
                list.add(Arrays.asList(start,i-1));
            }
        }
        return list;
    }
}
