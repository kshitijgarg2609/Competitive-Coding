class Solution
{
    public final static String ones[] = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public final static String tens11To19[] = new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public final static String tensPrefix[] = new String[]{"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public final static int tripletRange[] = new int[]{1000000000,1000000,1000,100};
    public final static String triplet[] = new String[]{"Billion","Million","Thousand","Hundred"};
    public String numberToWords(int num)
    {
        String str="";
        if(num<10)
        {
            str=ones[num];
        }
        else if(num>=10 && num<20)
        {
            str=tens11To19[num-10];
        }
        else if(num>=20 && num<100)
        {
            str=tensPrefix[num/10];
            if(num%10!=0)
            {
                str+=" "+numberToWords(num%10);
            }
        }
        else if(num>=100)
        {
            for(int i=0;i<4;i++)
            {
                if(num>=tripletRange[i])
                {
                    str=numberToWords(num/tripletRange[i])+" "+triplet[i];
                    if(num%tripletRange[i]!=0)
                    {
                        str+=" "+numberToWords(num%tripletRange[i]);
                    }
                    break;
                }
            }
        }
        return str;
    }
}
