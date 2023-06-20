class Solution
{
    public int[] getNoZeroIntegers(int n)
    {
        int arr[] = new int[]{1,n-1};
        while(String.valueOf(arr[0]).contains("0") || String.valueOf(arr[1]).contains("0"))
        {
            arr[0]++;
            arr[1]--;
        }
        return arr;
    }
}
