class Solution
{
    public boolean checkPowersOfThree(int n)
    {
        for(char c : Integer.toString(n,3).toCharArray())
        {
            if(c!='0' && c!='1')
            {
                return false;
            }
        }
        return true;
    }
}
