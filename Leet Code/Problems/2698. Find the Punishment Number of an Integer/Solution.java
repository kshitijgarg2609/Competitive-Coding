class Solution
{
    public int punishmentNumber(int n)
    {
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            String sq = Integer.toString(i*i);
            for(int msk=0;msk<=(1<<(sq.length()-1));msk++)
            {
                List<Integer> list = new ArrayList<>(){{add(0);}};
                for(int indx=1,temp=msk;indx<=sq.length()-1;temp/=2,indx++)
                {
                    if(temp%2==1)
                    {
                        list.add(indx);
                    }
                }
                list.add(sq.length());
                int subsum=IntStream.range(0,list.size()-1).map(j->Integer.parseInt(sq.substring(list.get(j),list.get(j+1)))).sum();
                if(subsum==i)
                {
                    cnt+=Integer.parseInt(sq);
                    break;
                }
            }
        }
        return cnt;
    }
}
