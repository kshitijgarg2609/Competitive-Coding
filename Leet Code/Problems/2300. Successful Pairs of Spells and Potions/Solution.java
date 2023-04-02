class Solution
{
    public int[] successfulPairs(int[] spells, int[] potions, long success)
    {
        int arr[] = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++)
        {
            int left=0-1;
            int right=potions.length;
            while((right-left)>1)
            {
                int mid=(left+right+1)/2;
                long prod=1L*spells[i]*potions[mid];
                if(success<=prod)
                {
                    right=mid;
                }
                else
                {
                    left=mid;
                }
            }
            arr[i]=potions.length-right;
        }
        return arr;
    }
}
