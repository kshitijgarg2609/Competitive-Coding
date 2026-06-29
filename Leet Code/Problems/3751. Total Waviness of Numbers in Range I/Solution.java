class Solution
{
    public int totalWaviness(int num1, int num2)
    {
        return IntStream.rangeClosed(num1,num2).filter(n->n>=100).map(n->
        {
            int d[] = String.valueOf(n).chars().map(c->c-'0').toArray();
            return (int)IntStream.range(1,d.length-1).filter(i->(d[i]>d[i-1] && d[i]>d[i+1]) || (d[i]<d[i-1] && d[i]<d[i+1])).count();
        }).sum();
    }
}
