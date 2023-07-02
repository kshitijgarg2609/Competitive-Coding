class Solution
{
    public int maximumRequests(int n, int[][] requests)
    {
        int ans=0;
        loop:
        for(int i=1;i<(1<<requests.length);i++)
        {
            int balance[] = new int[n];
            if(Integer.bitCount(i)<=ans)
            {
                continue;
            }
            int j=requests.length-1;
            String binary=Integer.toBinaryString(i);
            for(int k=binary.length()-1;k>=0;k--,j--)
            {
                if(binary.charAt(k)=='1')
                {
                    balance[requests[j][0]]--;
                    balance[requests[j][1]]++;
                }
            }
            for(int x : balance)
            {
                if(x!=0)
                {
                    continue loop;
                }
            }
            ans=Integer.bitCount(i);
        }
        return ans;
    }
}
