class Solution
{
    public long maxMatrixSum(int[][] matrix)
    {
        long sum=0L;
        int min=Integer.MAX_VALUE,neg=0;
        for(int mat[] : matrix)
        {
            for(int m : mat)
            {
                sum+=Math.abs(m);
                neg+=(m<0)?1:0;
                min=Integer.min(min,Math.abs(m));
            }
        }
        if(neg%2==1)
        {
            sum-=min;
            sum-=min;
        }
        return sum;
    }
}
