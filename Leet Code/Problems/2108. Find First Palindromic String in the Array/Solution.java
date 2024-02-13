class Solution
{
    public String firstPalindrome(String[] words)
    {
        String ans="";
        outer: for(String word : words)
        {
            for(int i=0,j=word.length()-1;i<word.length()/2;i++,j--)
            {
                if(word.charAt(i)!=word.charAt(j))
                {
                    continue outer;
                }
            }
            ans=word;
            break;
        }
        return ans;
    }
}
