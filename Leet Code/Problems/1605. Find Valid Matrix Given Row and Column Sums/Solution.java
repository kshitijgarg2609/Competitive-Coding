class Solution
{
    public int[][] restoreMatrix(int[] rowSum, int[] colSum)
    {
        int matrix[][] = new int[rowSum.length][colSum.length];
        for(int point[] = new int[]{0,0};point[0]<rowSum.length && point[1]<colSum.length;point[(rowSum[point[0]]==0?0:1)]++)
        {
            matrix[point[0]][point[1]]=Integer.min(rowSum[point[0]],colSum[point[1]]);
            rowSum[point[0]]-=matrix[point[0]][point[1]];
            colSum[point[1]]-=matrix[point[0]][point[1]];
        }
        return matrix;
    }
}
