class Solution
{
    public int countBinarySubstrings(String s)
    {
        int sum=0;
        int cnt[] = new int[2];
        for(int i=0;i<s.length();i++)
        {
            int indx=s.charAt(i)-'0';
            cnt[indx]++;
            if(i==s.length()-1 || indx!=(s.charAt(i+1)-'0'))
            {
                sum+=Integer.min(cnt[0],cnt[1]);
                cnt[(indx+1)%2]=0;
            }
        }
        return sum;
    }
}
