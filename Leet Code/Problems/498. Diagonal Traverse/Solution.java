class Solution
{
    public int[] findDiagonalOrder(int[][] mat)
    {
        int m=mat.length,n=mat[0].length;
        int arr[] = new int[m*n];
        for(int in=0,i=0,j=0,d=-1;in<arr.length;in++)
        {
            arr[in]=mat[i][j];
            if((i+d)>=0 && (i+d)<m && (j-d)>=0 && (j-d)<n)
            {
                i+=d;
                j-=d;
            }
            else if(d==-1)
            {
                d=-d;
                if(j==n-1)
                {
                    i++;
                }
                else if(i==0)
                {
                    j++;
                }
            }
            else if(d==1)
            {
                d=-d;
                if(i==m-1)
                {
                    j++;
                }
                else if(j==0)
                {
                    i++;
                }
            }
        }
        return arr;
    }
}
