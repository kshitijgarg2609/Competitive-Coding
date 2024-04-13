class Solution
{
    public int maximalRectangle(char[][] matrix)
    {
        int max=0;
        int cnt[] = new int[matrix[0].length];
        for(char mat[] : matrix)
        {
            for(int i=0;i<mat.length;i++)
            {
                cnt[i]=(mat[i]=='1')?(cnt[i]+1):0;
            }
            Stack<Integer> st_l = new Stack<Integer>();
            Stack<Integer> st_r = new Stack<Integer>();
            int left[] = new int[mat.length];
            int right[] = new int[mat.length];
            for(int l=0,r=mat.length-1;l<mat.length;l++,r--)
            {
                for(;!st_l.empty() && cnt[st_l.peek()]>=cnt[l];st_l.pop());
                left[l]=(st_l.empty())?0:(st_l.peek()+1);
                st_l.push(l);
                for(;!st_r.empty() && cnt[st_r.peek()]>=cnt[r];st_r.pop());
                right[r]=(st_r.empty())?(mat.length-1):(st_r.peek()-1);
                st_r.push(r);
            }
            for(int i=0;i<mat.length;i++)
            {
                max=Integer.max(max,cnt[i]*(right[i]-left[i]+1));
            }
        }
        return max;
    }
}
