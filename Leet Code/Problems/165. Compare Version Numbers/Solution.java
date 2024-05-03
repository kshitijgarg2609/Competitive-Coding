class Solution
{
    public int compareVersion(String version1, String version2)
    {
        int ver1[] = Arrays.stream(version1.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int ver2[] = Arrays.stream(version2.split("\\.")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<Integer.max(ver1.length, ver2.length);i++)
        {
            int comp[] = new int[]{(i<ver1.length?ver1[i]:0),(i<ver2.length?ver2[i]:0)};
            if(comp[0]!=comp[1])
            {
                return comp[0]<comp[1]?-1:1;
            }
        }
        return 0;
    }
}
