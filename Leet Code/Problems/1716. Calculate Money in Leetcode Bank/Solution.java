class Solution
{
    public int totalMoney(int n)
    {
        return (n/7)*(28+28+((n/7)-1)*7)/2+IntStream.range(0,n%7).map(v->(n/7)+1+v).sum();
    }
}
