class Solution
{
    public int maxSatisfaction(int[] satisfaction)
    {
        Arrays.sort(satisfaction);
        int i,c;
        for(i=satisfaction.length-1,c=0;i>=0 && (c+=satisfaction[i])>=0;i--);
        int sol=0;
        for(c=i+1;c<satisfaction.length;c++)
        {
            sol+=(c-i)*satisfaction[c];
        }
        return sol;
    }
}
