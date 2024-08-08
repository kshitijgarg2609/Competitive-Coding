class Solution
{
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart)
    {
        int dir[][] = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int vis[][] = new int[rows*cols][2];
        vis[0]=new int[]{rStart,cStart};
        for(int i=2,d=0,pnt[]=vis[0];i<=rows*cols;)
        {
            pnt = new int[]{pnt[0]+dir[d][0],pnt[1]+dir[d][1]};
            if(pnt[0]>=0 && pnt[0]<rows && pnt[1]>=0 && pnt[1]<cols)
            {
                vis[i++-1]=pnt;
            }
            if((pnt[0]-rStart)==(pnt[1]-cStart) || (d==2 && (pnt[0]-rStart)==(cStart-pnt[1])) || (d==0 && (pnt[0]-rStart)==(cStart-(pnt[1]-1))))
            {
                d=(d+1)%4;
            }
        }
        return vis;
    }
}
