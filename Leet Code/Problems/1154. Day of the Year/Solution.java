class Solution
{
    public int dayOfYear(String date)
    {
        int yy=Integer.parseInt(date.substring(0,4));
        int mm=Integer.parseInt(date.substring(5,7));
        int dd=Integer.parseInt(date.substring(8,10));
        int cnt=dd;
        for(int i=1;i<mm;i++)
        {
            switch(i)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                {
                    cnt+=31;
                    break;
                }
                case 2:
                {
                    cnt+=((yy%400==0) || (yy%4==0 && yy%100!=0))?29:28;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    cnt+=30;
                    break;
                }
            }
        }
        return cnt;
    }
}
