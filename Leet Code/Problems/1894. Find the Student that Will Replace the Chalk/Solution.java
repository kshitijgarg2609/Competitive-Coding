class Solution
{
    public int chalkReplacer(int[] chalk, int k)
    {
        int indx=0;
        for(k=(int)(k%Arrays.stream(chalk).mapToLong(val->(long)val).sum());indx<chalk.length && k>=chalk[indx];k-=chalk[indx++]);
        return indx;
    }
}
