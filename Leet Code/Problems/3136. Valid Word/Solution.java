class Solution
{
    public boolean isValid(String word)
    {
        if(word.length()<3)
        {
            return false;
        }
        int vo=0,cn=0;
        for(char c : word.toCharArray())
        {
            if(!Character.isAlphabetic(c) && !Character.isDigit(c))
            {
                return false;
            }
            else if(Character.isDigit(c))
            {
                continue;
            }
            char d=Character.toLowerCase(c);
            if(d=='a' || d=='e' || d=='i' || d=='o' || d=='u')
            {
                vo++;
            }
            else
            {
                cn++;
            }
        }
        return vo>=1 && cn>=1;
    }
}
