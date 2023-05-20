class Solution
{
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries)
    {
        Map<String,List<List<String>>> map = new HashMap<>();
        for(int i=0;i<equations.size();i++)
        {
            List<List<String>> u = map.getOrDefault(equations.get(i).get(0),new ArrayList<>());
            u.add(Arrays.asList(equations.get(i).get(1),String.valueOf(values[i])));
            if(u.size()==1)
            {
                map.put(equations.get(i).get(0),u);
            }
            List<List<String>> v = map.getOrDefault(equations.get(i).get(1),new ArrayList<>());
            v.add(Arrays.asList(equations.get(i).get(0),String.valueOf(1/values[i])));
            if(v.size()==1)
            {
                map.put(equations.get(i).get(1),v);
            }
        }

        double ans[] = new double[queries.size()];
        for(int i=0;i<queries.size();i++)
        {
            ans[i]=-1.0;
            if(!map.containsKey(queries.get(i).get(0)))
            {
                continue;
            }
            Set<String> set = new HashSet<>();
            set.add(queries.get(i).get(0));
            Queue<String> qu = new LinkedList<>();
            Queue<Double> qu_val = new LinkedList<>();
            qu.add(queries.get(i).get(0));
            qu_val.add(1.0);
            while(!qu.isEmpty())
            {
                String pop = qu.remove();
                double val = qu_val.remove();
                if(queries.get(i).get(1).equals(pop))
                {
                    ans[i]=val;
                    break;
                }
                if(map.containsKey(pop))
                {
                    for(List<String> adj : map.get(pop))
                    {
                        if(set.contains(adj.get(0)))
                        {
                            continue;
                        }
                        set.add(adj.get(0));
                        double nxt=val*Double.parseDouble(adj.get(1));
                        qu.add(adj.get(0));
                        qu_val.add(nxt);
                    }
                }
            }
        }
        return ans;
    }
}
