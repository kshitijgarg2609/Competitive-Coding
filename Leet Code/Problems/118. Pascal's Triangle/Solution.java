class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            int arr[] = new int[i+1];
            arr[0]=arr[arr.length-1]=1;
            for(int j=1;j<arr.length-1;j++)
            {
                arr[j]=list.get(i-1).get(j-1)+list.get(i-1).get(j);
            }
            list.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        }
        return list;
    }
}
