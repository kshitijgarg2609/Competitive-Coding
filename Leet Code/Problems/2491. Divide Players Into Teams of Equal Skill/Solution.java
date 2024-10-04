class Solution
{
    public long dividePlayers(int[] skill)
    {
        Arrays.sort(skill);
        long sum=0,target=skill[0]+skill[skill.length-1];
        for(int i=0,j=skill.length-1;i<j;i++,j--)
        {
            if((skill[i]+skill[j])!=target)
            {
                return -1;
            }
            sum+=(1L*skill[i]*skill[j]);
        }
        return sum;
    }
}
