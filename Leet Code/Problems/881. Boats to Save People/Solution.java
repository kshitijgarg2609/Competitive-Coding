class Solution
{
    public int numRescueBoats(int[] people, int limit)
    {
        int cnt=0;
        Arrays.sort(people);
        for(int i=0,j=people.length-1;i<=j;cnt++,j--)
        {
            if((people[i]+people[j])<=limit)
            {
                i++;
            }
        }
        return cnt;
    }
}
