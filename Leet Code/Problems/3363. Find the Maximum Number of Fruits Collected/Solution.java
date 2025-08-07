class Solution
{
    public int maxCollectedFruits(int[][] fruits)
    {
        int dp[][] = new int[fruits.length][fruits.length];
        dp[0][0]=fruits[0][0];
        IntStream.range(0,fruits.length-1).forEach(i->dp[i+1][i+1]=dp[i][i]+fruits[i+1][i+1]);
        Set<Integer> td = new HashSet<>(){{add(fruits.length-1);}};
        dp[0][fruits.length-1]=fruits[0][fruits.length-1];
        Set<Integer> lr = new HashSet<>(){{add(fruits.length-1);}};
        dp[fruits.length-1][0]=fruits[fruits.length-1][0];
        for(int mv[]=new int[1];mv[0]<fruits.length-1;mv[0]++)
        {
            td=td
            .stream()
            .flatMap(v->
                IntStream.of(v-1,v,v+1)
                .mapToObj(g->new int[][]{{mv[0],v},{mv[0]+1,g}})
                .filter(arr->arr[1][1]<fruits.length && arr[1][0]<arr[1][1])
                .map(arr->
                {
                    dp[arr[1][0]][arr[1][1]]=Integer.max(dp[arr[1][0]][arr[1][1]],dp[arr[0][0]][arr[0][1]]+fruits[arr[1][0]][arr[1][1]]);
                    return arr[1][1];
                }))
            .collect(Collectors.toSet());
            lr=lr
            .stream()
            .flatMap(v->
                IntStream.of(v-1,v,v+1)
                .mapToObj(g->new int[][]{{v,mv[0]},{g,mv[0]+1}})
                .filter(arr->arr[1][0]<fruits.length && arr[1][0]>arr[1][1])
                .map(arr->
                {
                    dp[arr[1][0]][arr[1][1]]=Integer.max(dp[arr[1][0]][arr[1][1]],dp[arr[0][0]][arr[0][1]]+fruits[arr[1][0]][arr[1][1]]);
                    return arr[1][0];
                }))
            .collect(Collectors.toSet());
        }
        return dp[dp.length-1][dp.length-1]+dp[dp.length-1-1][dp.length-1]+dp[dp.length-1][dp.length-1-1];
    }
}
