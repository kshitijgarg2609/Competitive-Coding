class Solution
{
    public int distanceBetweenBusStops(int[] distance, int start, int destination)
    {
        int clockwise=0,anticlockwise=0;
        for(int i=start;i!=destination;i=(i+1)%distance.length)
        {
            clockwise+=distance[i];
        }
        for(int i=destination;i!=start;i=(i+1)%distance.length)
        {
            anticlockwise+=distance[i];
        }
        return Integer.min(clockwise,anticlockwise);
    }
}
