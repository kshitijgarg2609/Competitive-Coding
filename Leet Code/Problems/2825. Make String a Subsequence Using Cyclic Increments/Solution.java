class Solution
{
    public boolean canMakeSubsequence(String str1, String str2)
    {
        int j=0;
        for(int i=0;i<str1.length() && j<str2.length();i++)
        {
            int a=str1.charAt(i)-'a';
            int b=str2.charAt(j)-'a';
            if(a==b || ((a+1)%26)==b)
            {
                j++;
            }
        }
        return j==str2.length();
    }
}
