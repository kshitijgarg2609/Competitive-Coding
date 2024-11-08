class Solution
{
    public int largestCombination(int[] candidates)
    {
        int bitCount[] = new int[24];
        for(int candidate : candidates)
        {
            String binary = Integer.toBinaryString(candidate);
            for(int i=binary.length()-1,j=0;i>=0;i--,j++)
            {
                bitCount[j]+=binary.charAt(i)-'0';
            }
        }
        return Arrays.stream(bitCount).max().getAsInt();
    }
}
