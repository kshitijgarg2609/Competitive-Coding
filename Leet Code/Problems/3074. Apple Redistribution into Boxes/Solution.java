class Solution
{
    public int minimumBoxes(int[] apple, int[] capacity)
    {
        int sum=Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int cnt=0;
        for(int i=capacity.length-1;i>=0 && sum>0;sum-=capacity[i--],cnt++);
        return cnt;
    }
}
