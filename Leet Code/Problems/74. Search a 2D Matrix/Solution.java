class Solution
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        for(int m=matrix.length,n=matrix[0].length,left=0,right=(m*n)-1;left<=right;)
        {
            int mid=(left+right)/2,i=mid/n,j=mid-(i*n);
            if(matrix[i][j]>target)
            {
                right=mid-1;
            }
            else if(matrix[i][j]<target)
            {
                left=mid+1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
