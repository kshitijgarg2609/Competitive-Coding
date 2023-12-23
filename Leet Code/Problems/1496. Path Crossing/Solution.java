class Solution
{
    public boolean isPathCrossing(String path)
    {
        Map<Character,int[]> dir = new HashMap<>(){{put('N',new int[]{0,1});put('S',new int[]{0,-1});put('E',new int[]{-1,0});put('W',new int[]{1,0});}};
        Map<Integer,Set<Integer>> map = new HashMap<>(){{put(0,new HashSet<>(){{add(0);}});}};
        int pnt[] = new int[]{0,0};
        for(char c : path.toCharArray())
        {
            int nxt[] = dir.get(c);
            pnt=new int[]{pnt[0]+nxt[0],pnt[1]+nxt[1]};
            if(map.containsKey(pnt[0]) && map.get(pnt[0]).contains(pnt[1]))
            {
                return true;
            }
            map.putIfAbsent(pnt[0],new HashSet<>());
            map.get(pnt[0]).add(pnt[1]);
        }
        return false;
    }
}
