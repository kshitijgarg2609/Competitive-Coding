class Solution
{
    public boolean checkInclusion(String s1, String s2)
    {
        int cnt[] = new int[26];
        for(char c : s1.toCharArray())
        {
            cnt[c-'a']++;
        }
        for(int i=0;(i+s1.length())<=s2.length();i++)
        {
            if(cnt[s2.charAt(i)-'a']!=0)
            {
                int arr[] = Arrays.copyOf(cnt,cnt.length);
                for(int j=i;j<(i+s1.length());j++)
                {
                    arr[s2.charAt(j)-'a']--;
                }
                if(Arrays.stream(arr).filter(x->(x==0)).count()==cnt.length)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
