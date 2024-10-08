class Solution
{
    public int minSwaps(String s)
    {
        int cnt=0;
        char str[] = s.toCharArray();
        for(int i=0,j=str.length-1,bal=0;i<j;i++)
        {
            if(str[i]=='[' || (bal>0 && str[i]==']'))
            {
                bal+=(str[i]=='[')?1:-1;
            }
            else if(bal==0)
            {
                char tmp=str[j=s.lastIndexOf('[',j)];
                str[j]=str[i];
                str[i]=tmp;
                bal++;
                cnt++;
            }
        }
        return cnt;
    }
}
