class Solution
{
    public int countLargestGroup(int n)
    {
        int sumOfDigits[] = new int[36];
        for(int i=1;i<=n;i++)
        {
            sumOfDigits[String.valueOf(i).chars().map(c->c-'0').sum()-1]++;
        }
        int largest=0;
        int cnt=0;
        for(int x : sumOfDigits)
        {
            if(x>largest)
            {
                largest=x;
                cnt=1;
            }
            else if(x==largest)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
