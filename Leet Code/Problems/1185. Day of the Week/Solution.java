class Solution
{
    public String dayOfTheWeek(int day, int month, int year)
    {
        String week[] = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        boolean leap_year=(year%400==0) || (year%4==0 && year%100!=0);
        int ndays=day-1;
        if(year>1971)
        {
            int total_leap_year=((year-1972)/4)+((leap_year || year%4==0)?0:1);
            ndays+=(total_leap_year*366)+((year-1971-total_leap_year)*365);
        }
        for(int i=1;i<month;i++)
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
                    ndays+=31;
                    break;
                }
                case 2:
                {
                    ndays+=((leap_year)?29:28);
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    ndays+=30;
                    break;
                }
            }
        }
        return week[(ndays+5)%7];
    }
}
