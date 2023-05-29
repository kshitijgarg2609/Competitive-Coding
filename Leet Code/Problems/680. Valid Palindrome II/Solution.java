class Solution
{
    public boolean validPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                boolean flg[] = new boolean[]{true,true};
                int k=0;
                for(int indx[] : (new int[][]{{i,j-1},{i+1,j}}))
                {
                    while(indx[0]<indx[1])
                    {
                        if(s.charAt(indx[0])!=s.charAt(indx[1]))
                        {
                            flg[k]=false;
                            break;
                        }
                        indx[0]++;
                        indx[1]--;
                    }
                    k++;
                }
                return flg[0]||flg[1];
            }
            i++;
            j--;
        }
        return  true;
    }
}
