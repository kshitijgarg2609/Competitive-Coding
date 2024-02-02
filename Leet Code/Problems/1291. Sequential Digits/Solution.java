class Solution
{
    public List<Integer> sequentialDigits(int low, int high)
    {
        List<Integer> list = new LinkedList<>();
        String str = "123456789";
        for(int k=2;k<=9;k++)
        {
            if(k<Integer.toString(low).length() || k>Integer.toString(high).length())
            {
                continue;
            }
            for(int i=0;i<=str.length()-k;i++)
            {
                int val=Integer.parseInt(str.substring(i,i+k));
                if(val>=low && val<=high)
                {
                    list.add(val);
                }
            }
        }
        return list;
    }
}
