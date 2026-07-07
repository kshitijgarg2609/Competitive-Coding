class Solution
{
    public long sumAndMultiply(int n)
    {
        if(n==0)
        {
            return 0L;
        }
        StringBuilder sb = new StringBuilder();
        String.valueOf(n).chars().map(c->c-'0').filter(c->c!=0).forEach(d->sb.append(d));
        return 1L*Integer.parseInt(sb.toString())*sb.chars().map(c->c-'0').sum();
    }
}
