class Solution
{
    public static int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob)
    {
        int cnt=0;
        int aliceArr = Integer.parseInt(arriveAlice.replace("-", ""));
        int aliceLea = Integer.parseInt(leaveAlice.replace("-", ""));
        int bobArr = Integer.parseInt(arriveBob.replace("-", ""));
        int bobLea = Integer.parseInt(leaveBob.replace("-", ""));
        boolean aliceRome=false, bobRome=false;
        for(int mm=1;mm<=12;mm++)
        {
            for(int dd=1;dd<=days[mm];dd++)
            {
                int date = (100*mm)+dd;
                if(!aliceRome && date==aliceArr) aliceRome=true;
                if(!bobRome && date==bobArr) bobRome=true;
                if(aliceRome && bobRome) cnt++;
                if(aliceRome && date==aliceLea) aliceRome=false;
                if(bobRome && date==bobLea) bobRome=false;
            }
        }
        return cnt;
    }
}
