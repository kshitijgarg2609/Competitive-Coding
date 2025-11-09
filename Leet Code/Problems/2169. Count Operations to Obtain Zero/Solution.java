class Solution
{
    public int countOperations(int num1, int num2)
    {
        return (num1==0 || num2==0)?0:(1+countOperations((num1<num2)?num1:(num1-num2), (num1<num2)? (num2-num1):num2));
    }
}
