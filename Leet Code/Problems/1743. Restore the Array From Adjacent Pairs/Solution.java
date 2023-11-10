class Solution
{
    public int[] restoreArray(int[][] adjacentPairs)
    {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int adj[] : adjacentPairs)
        {
            map.putIfAbsent(adj[0],new LinkedList<>());
            map.get(adj[0]).add(adj[1]);
            map.putIfAbsent(adj[1],new LinkedList<>());
            map.get(adj[1]).add(adj[0]);
        }
        int arr[] = new int[adjacentPairs.length+1];
        arr[0]=map.keySet().stream().mapToInt(Integer::intValue).filter(k->map.get(k).size()==1).findFirst().getAsInt();
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i-1]).get(0);
            map.get(arr[i]).remove(Integer.valueOf(arr[i-1]));
        }
        return arr;
    }
}
