class Solution
{
    public boolean checkRecord(String s)
    {
        int L=0;
        int A=0;
        for(char c : s.toCharArray())
        {
            if(c=='L')
            {
                L++;
            }
            else if(c=='A')
            {
                A++;
                L=0;
            }
            else if(c=='P')
            {
                L=0;
            }
            if(A>=2 || L>=3)
            {
                return false;
            }
        }
        return true;
    }
}
