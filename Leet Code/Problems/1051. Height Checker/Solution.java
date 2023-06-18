class Solution
{
    public int heightChecker(int[] heights)
    {
        int cnt=0;
        int i=0;
        for(int x : Arrays.stream(heights).sorted().toArray())
        {
            if(heights[i++]!=x)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
