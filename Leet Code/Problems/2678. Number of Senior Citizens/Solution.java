class Solution
{
    public int countSeniors(String[] details)
    {
        return (int)(Arrays.stream(details).mapToInt(str->Integer.parseInt(str.substring(11,13))).filter(age->age>60).count());
    }
}
