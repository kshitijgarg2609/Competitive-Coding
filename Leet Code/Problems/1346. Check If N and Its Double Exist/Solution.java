class Solution
{
    public boolean checkIfExist(int[] arr)
    {
        Set<Integer> set = new HashSet<>(){{add(2*arr[0]);}};
        for(int i=1;i<arr.length;i++)
        {
            if(set.contains(4*arr[i])||set.contains(arr[i]))
            {
                return true;
            }
            set.add(2*arr[i]);
        }
        return false;
    }
}
