class Solution
{
    public String predictPartyVictory(String senate)
    {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int indx=senate.length();
        for(int i=0;i<indx;i++)
        {
            switch(senate.charAt(i))
            {
                case 'R':
                {
                    r.add(i);
                    break;
                }
                case 'D':
                {
                    d.add(i);
                    break;
                }
            }
        }
        while(!r.isEmpty() && !d.isEmpty())
        {
            int r_sen=r.remove();
            int d_sen=d.remove();
            if(r_sen<d_sen)
            {
                r.add(indx++);
            }
            else
            {
                d.add(indx++);
            }
        }
        return (!r.isEmpty())?"Radiant":"Dire";
    }
}
