class Solution
{
    public int[] decrypt(int[] code, int k)
    {
        int arr[] = new int[code.length];
        if(k==0)
        {
            return arr;
        }
        for(int i=0;i<code.length;i++)
        {
            for(int j=1;j<=Math.abs(k);j++)
            {
                arr[i]+=code[(i+code.length+(k>0?j:-j))%code.length];
            }
        }
        return arr;
    }
}
