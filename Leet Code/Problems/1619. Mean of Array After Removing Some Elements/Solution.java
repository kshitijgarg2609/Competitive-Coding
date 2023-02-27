class Solution
{
    public double trimMean(int[] arr)
    {
        int percent_5=arr.length/20;
        Arrays.sort(arr);
        return Math.round((Arrays.stream(Arrays.copyOfRange(arr,percent_5,arr.length-percent_5)).asDoubleStream().sum())/(arr.length-(2*percent_5))*100000d)/100000d;
    }
}
