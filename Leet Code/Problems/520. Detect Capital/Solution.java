class Solution
{
    public boolean detectCapitalUse(String word)
    {
        for(int i=2;i<word.length();i++)
        {
            if(Character.isLowerCase(word.charAt(i-1)) != Character.isLowerCase(word.charAt(i)))
            {
                return false;
            }
        }
        return !(word.length()>=2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)));
    }
}
