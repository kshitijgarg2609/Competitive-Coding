class Solution
{
    public int minOperations(String[] logs)
    {
        int cnt=0;
        for(String l : logs)
        {
            switch(l)
            {
                case "./":
                {
                    continue;
                }
                case "../":
                {
                    if(cnt>0)
                    {
                        cnt--;
                    }
                    break;
                }
                default:
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
