class UndergroundSystem
{
    Map<Integer,String[]> in;
    Map<String,double[]> out;
    public UndergroundSystem()
    {
        in=new HashMap<>();
        out=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t)
    {
        in.put(id,new String[]{stationName,String.valueOf(t)});
    }
    
    public void checkOut(int id, String stationName, int t)
    {
        String in_data[]=in.remove(id);
        String key=in_data[0]+"->"+stationName;
        double val[] = out.getOrDefault(key,new double[]{0,0});
        val[0]+=t-Integer.parseInt(in_data[1]);
        val[1]++;
        if(val[1]==1)
        {
            out.put(key,val);
        }
    }
    
    public double getAverageTime(String startStation, String endStation)
    {
        String key=startStation+"->"+endStation;
        double val[] = out.get(key);
        return val[0]/val[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
