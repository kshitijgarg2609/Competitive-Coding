class Solution
{
    public String pushDominoes(String dominoes) 
    {
        char d[] = dominoes.toCharArray();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<d.length;i++)
        {
            if(d[i]=='L' || d[i]=='R')
            {
                qu.add(i);
            }
        }
        if(!qu.isEmpty() && d[qu.peek()]=='L')
        {
            for(int i=0;i<qu.peek();d[i++]='L');
        }
        while(qu.size()>1)
        {
            int ld=qu.remove();
            if(d[ld]==d[qu.peek()])
            {
                for(int i=ld+1;i<qu.peek();d[i++]=d[ld]);
            }
            else if(d[ld]=='R' && d[qu.peek()]=='L')
            {
                for(int i=ld+1,j=qu.peek()-1;i<j;d[i++]='R',d[j--]='L');
            }
        }
        if(!qu.isEmpty() && d[qu.peek()]=='R')
        {
            for(int i=qu.remove();i<d.length;d[i++]='R');
        }
        return new String(d);
    }
}
