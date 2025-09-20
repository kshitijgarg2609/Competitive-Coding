class Spreadsheet
{
    private Map<String,Integer> map;
    public Spreadsheet(int rows)
    {
        map=new HashMap<>();
    }
    
    public void setCell(String cell, int value)
    {
        map.put(cell,value);
    }
    
    public void resetCell(String cell)
    {
        map.put(cell,0);
    }
    
    public int getValue(String formula)
    {
        return Arrays.stream(formula.substring(1).split("\\+")).mapToInt(str->Character.isDigit(str.charAt(0))?Integer.parseInt(str):map.getOrDefault(str,0)).sum();
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
