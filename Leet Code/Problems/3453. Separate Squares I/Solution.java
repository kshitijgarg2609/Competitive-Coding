class Solution
{
    public double separateSquares(int[][] squares)
    {
        double totalArea = Arrays.stream(squares).mapToDouble(sq->1L*sq[2]*sq[2]).sum();
        double y[] = new double[]{0.0,0.0,Arrays.stream(squares).mapToDouble(sq->(double)(sq[1]+sq[2])).max().getAsDouble()};
        for(y[1]=(y[0]+y[2])/2;Math.abs(y[2]-y[0])>1e-5;y[1]=(y[0]+y[2])/2)
        {
            double area = Arrays.stream(squares).filter(sq->sq[1]<y[1]).mapToDouble(sq->1L*sq[2]*Math.min(y[1]-sq[1],sq[2])).sum();
            if((2*area)>=totalArea)
            {
                y[2]=y[1];
            }
            else
            {
                y[0]=y[1];
            }
        }
        return y[2];
    }
}
