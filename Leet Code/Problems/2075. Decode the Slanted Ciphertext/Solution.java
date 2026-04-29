class Solution
{
    public String decodeCiphertext(String encodedText, int rows)
    {
        StringBuilder sb = new StringBuilder();
        outer:
        for(int i=0;i<encodedText.length()/rows;i++)
        {
            for(int j=i;j<encodedText.length();j+=(encodedText.length()/rows)+1)
            {
                sb.append(encodedText.charAt(j));
            }
        }
        for(;sb.length()>0 && sb.charAt(sb.length()-1)==' ';sb.deleteCharAt(sb.length()-1));
        return sb.toString();
    }
}
