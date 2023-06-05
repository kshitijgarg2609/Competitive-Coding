class Solution
{
    public boolean checkStraightLine(int[][] coordinates)
    {
        int dx=coordinates[1][0]-coordinates[0][0];
        int dy=coordinates[1][1]-coordinates[0][1];
        for(int i=2;i<coordinates.length;i++)
        {
            if(dx*(coordinates[0][1]-coordinates[i][1]) != dy*(coordinates[0][0]-coordinates[i][0]))
            {
                return false;
            }
        }
        return true;
    }
}
