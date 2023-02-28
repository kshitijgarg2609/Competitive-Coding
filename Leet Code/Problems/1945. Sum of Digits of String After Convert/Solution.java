class Solution
{
    public int getLucky(String s, int k)
    {
        int cnt=0;
        for(char c : s.toCharArray())
        {
            cnt+=((c-'a'+1)/10)+((c-'a'+1)%10);
        }
        for(int i=1;i<k && cnt>9;i++)
        {
            int n=cnt;
            cnt=0;
            while(n>0)
            {
                cnt+=(n%10);
                n/=10;
            }
        }
        return cnt;
    }
}
