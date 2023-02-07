class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int color)
    {
        int dir[][] = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        int r=image.length;
        int c=image[0].length;
        int old_color=image[sr][sc];
        if(old_color==color)
        {
            return image;
        }
        image[sr][sc]=color;
        List<int[]> list = new LinkedList<>(Arrays.asList(new int[]{sr,sc}));
        while(list.size()>0)
        {
            int pop[] = list.remove(0);
            for(int d[] : dir)
            {
                int move[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                if(move[0]>=0 && move[0]<r && move[1]>=0 && move[1]<c && image[move[0]][move[1]]==old_color)
                {
                    image[move[0]][move[1]]=color;
                    list.add(move);
                }
            }
        }
        return image;
    }
}
