class Solution
{
    public int candy(int[] ratings)
    {
        int l[] = new int[ratings.length];
        int r[] = new int[ratings.length];
        l[0]=r[ratings.length-1]=1;
        for(int i=1,j=ratings.length-2;i<ratings.length;i++,j--)
        {
            l[i]=(ratings[i]>ratings[i-1])?(l[i-1]+1):1;
            r[j]=(ratings[j]>ratings[j+1])?(r[j+1]+1):1;
        }
        int cnt=0;
        for(int i=0;i<ratings.length;i++)
        {
            cnt+=Integer.max(l[i],r[i]);
        }
        return cnt;
    }
}
