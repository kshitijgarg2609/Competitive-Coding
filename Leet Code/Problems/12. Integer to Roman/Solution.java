class Solution
{
    public String intToRoman(int num)
    {
        if(num==0)
        {
            return "";
        }
        else if(num>=1 && num<=9)
        {
            if(num==4)
            {
                return "IV";
            }
            else if(num==9)
            {
                return "IX";
            }
            else if(num>=5)
            {
                return "V"+intToRoman(num-5);
            }
            else
            {
                return "I"+intToRoman(num-1);
            }
        }
        else if(num>=10 && num<=99)
        {
            if(num>=40&&num<50)
            {
                return "XL"+intToRoman(num-40);
            }
            else if(num>=90&&num<=99)
            {
                return "XC"+intToRoman(num-90);
            }
            else if(num>=50)
            {
                return "L"+intToRoman(num-50);
            }
            else
            {
                return "X"+intToRoman(num-10);
            }
        }
        else if(num>=100 && num<=999)
        {
            if(num>=400&&num<500)
            {
                return "CD"+intToRoman(num-400);
            }
            else if(num>=900&&num<=999)
            {
                return "CM"+intToRoman(num-900);
            }
            else if(num>=500)
            {
                return "D"+intToRoman(num-500);
            }
            else
            {
                return "C"+intToRoman(num-100);
            }
        }
        else
        {
            return "M"+intToRoman(num-1000);
        }
    }
}
