class Solution
{
    public int countStudents(int[] students, int[] sandwiches)
    {
        int cnt[] = new int[2];
        for(int student : students)
        {
            cnt[student]++;
        }
        for(int sandwich : sandwiches)
        {
            if(cnt[sandwich]==0)
            {
                break;
            }
            cnt[sandwich]--;
        }
        return cnt[0]+cnt[1];
    }
}
