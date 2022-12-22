class Solution
{
    public boolean isPalindrome(int x)
    {
        char num[] = (x+"").toCharArray();
        int l=num.length;
        for(int i=0,j=l-1;i<l/2;i++,j--)
        {
            if(num[i]!=num[j])
            {
                return false;
            }
        }
        return true;
    }
}
