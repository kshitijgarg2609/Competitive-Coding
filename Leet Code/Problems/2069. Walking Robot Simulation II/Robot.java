class Robot
{
    int x,y,indx;
    String d;
    List<int[]> xy = new LinkedList<>();
    List<String> dir = new LinkedList<>();
    public Robot(int width, int height)
    {
        for(int j=1;j<width;xy.add(new int[]{j,0}),dir.add("East"),j++);
        for(int i=1;i<height;xy.add(new int[]{width-1,i}),dir.add("North"),i++);
        for(int j=width-1-1;j>=0;xy.add(new int[]{j,height-1}),dir.add("West"),j--);
        for(int i=height-1-1;i>=0;xy.add(new int[]{0,i}),dir.add("South"),i--);
        x=0;
        y=0;
        d="East";
        indx=xy.size()-1;
    }
    
    public void step(int num)
    {
        indx=(indx+num)%xy.size();
        x=xy.get(indx)[0];
        y=xy.get(indx)[1];
        d=dir.get(indx);
    }
    
    public int[] getPos()
    {
        return new int[]{x,y};
    }
    
    public String getDir()
    {
        return d;
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
