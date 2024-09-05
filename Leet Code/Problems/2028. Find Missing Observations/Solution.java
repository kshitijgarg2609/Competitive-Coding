class Solution
{
    public int[] missingRolls(int[] rolls, int mean, int n)
    {
        int val[] = new int[n];
        int remain = (mean*(rolls.length+n))-Arrays.stream(rolls).sum();
        if(remain<n || remain>(6*n))
        {
            return new int[0];
        }
        Arrays.fill(val,remain/n);
        for(int i=0;i<remain%n;val[i++]++);
        return val;
    }
}
