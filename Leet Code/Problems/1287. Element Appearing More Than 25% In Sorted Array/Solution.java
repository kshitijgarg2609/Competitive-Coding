class Solution
{
    public int findSpecialInteger(int[] arr)
    {
        int cnt=1;
        int lst=arr[0];
        int sel=arr[0];
        double occupy_percentage=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==lst)
            {
                cnt++;
            }
            else
            {
                lst=arr[i];
                cnt=1;
            }
            double percentage=(cnt*100.0)/arr.length;
            if(percentage>occupy_percentage)
            {
                occupy_percentage=percentage;
                sel=lst;
            }
        }
        return sel;
    }
}
