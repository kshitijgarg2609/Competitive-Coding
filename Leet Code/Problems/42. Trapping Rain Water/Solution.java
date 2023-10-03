class Solution
{
    public int trap(int[] height)
    {
        int w=0;
        for(int i=0,j=height.length-1,max_left=0,max_right=0;i<j;)
        {
            if(height[i]<=height[j])
            {
                w+=(max_left=Integer.max(max_left,height[i]))-height[i++];
            }
            else
            {
                w+=(max_right=Integer.max(max_right,height[j]))-height[j--];
            }
        }
        return w;
    }
}
