class Solution
{
    public int binaryGap(int n)
    {
        String str = Integer.toBinaryString(n);
        int dist=0;
        int start=str.indexOf('1');
        for(int i=start+1;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                dist=Integer.max(dist,(i-start));
                start=i;
            }
        }
        return dist;
    }
}
