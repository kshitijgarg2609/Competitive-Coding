class Solution
{
    public char[][] rotateTheBox(char[][] box)
    {
        char arr[][] = new char[box[0].length][box.length];
        int col=box.length-1;
        for(char b[] : box)
        {
            for(int i=0;i<b.length;)
            {
                if(b[i++]=='#')
                {
                    int j=i-1,hash=1,dot=0;
                    for(;i<b.length;i++)
                    {
                        if(b[i]=='#')
                        {
                            hash++;
                        }
                        else if(b[i]=='.')
                        {
                            dot++;
                        }
                        else if(b[i]=='*')
                        {
                            break;
                        }
                    }
                    Arrays.fill(b,j,j+dot,'.');
                    Arrays.fill(b,j+dot,j+dot+hash,'#');
                }
            }
            for(int i=0;i<b.length;i++)
            {
                arr[i][col]=b[i];
            }
            col--;
        }
        return arr;
    }
}
