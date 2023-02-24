class Solution
{
    public int[][] flipAndInvertImage(int[][] image)
    {
        int r=image.length;
        int c=image[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c/2;j++)
            {
                int tmp=(image[i][j]+1)%2;
                image[i][j]=(image[i][c-j-1]+1)%2;
                image[i][c-j-1]=tmp;
            }
            if((c%2)==1)
            {
                image[i][c/2]=(image[i][c/2]+1)%2;
            }
        }
        return image;
    }
}
