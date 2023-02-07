class Solution
{
    public List<Integer> selfDividingNumbers(int left, int right)
    {
        List<Integer> list = new ArrayList<>();
        range:
        for(int i=left;i<=right;i++)
        {
            int j=i;
            while(j>0)
            {
                if((j%10)==0 || (i%(j%10))!=0)
                {
                    continue range;
                }
                j/=10;
            }
            list.add(i);
        }
        return list;
    }
}
