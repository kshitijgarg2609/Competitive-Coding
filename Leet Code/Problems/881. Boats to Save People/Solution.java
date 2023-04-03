class Solution
{
    public int numRescueBoats(int[] people, int limit)
    {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int cnt=0;
        while(i<=j)
        {
            if(i==j)
            {
                cnt++;
                break;
            }
            if((people[j]+people[i])<=limit)
            {
                i++;
            }
            j--;
            cnt++;
        }
        return cnt;
    }
}
