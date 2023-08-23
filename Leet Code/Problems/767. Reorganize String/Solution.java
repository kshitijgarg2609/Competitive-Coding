class Solution
{
    public String reorganizeString(String s)
    {
        int arr[][] = new int[26][2];
        for(char c : s.toCharArray())
        {
            arr[c-'a'][0]=c;
            arr[c-'a'][1]++;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
        if(arr[0][1]>((s.length()+1)/2))
        {
            return "";
        }
        int indx=0;
        char str[] = new char[s.length()];
        for(int x[] : arr)
        {
            for(int i=0;i<x[1];i++)
            {
                str[indx]=(char)(x[0]);
                indx+=2;
                if(indx>=s.length())
                {
                    indx=1;
                }
            }
        }
        return new String(str);
    }
}
