class FoodRatings
{
    private Map<String,Map.Entry<String,Integer>> food_map;
    private Map<String,java.util.NavigableMap<Integer,SortedSet<String>>> cuisine_map;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings)
    {
        food_map = new HashMap<>();
        cuisine_map = new HashMap<>();
        for(int i=0;i<foods.length;i++)
        {
            food_map.put(foods[i],new java.util.AbstractMap.SimpleEntry(cuisines[i],ratings[i]));
            cuisine_map.putIfAbsent(cuisines[i],new TreeMap<>(Collections.reverseOrder()));
            cuisine_map.get(cuisines[i]).putIfAbsent(ratings[i],new TreeSet<>());
            cuisine_map.get(cuisines[i]).get(ratings[i]).add(foods[i]);
        }
    }
    
    public void changeRating(String food, int newRating)
    {
        Map.Entry<String,Integer> e = food_map.get(food);
        if(cuisine_map.get(e.getKey()).get(e.getValue()).size()==1)
        {
            cuisine_map.get(e.getKey()).remove(e.getValue());
        }
        else
        {
            cuisine_map.get(e.getKey()).get(e.getValue()).remove(food);
        }
        e.setValue(newRating);
        cuisine_map.get(e.getKey()).putIfAbsent(e.getValue(),new TreeSet<>());
        cuisine_map.get(e.getKey()).get(e.getValue()).add(food);
    }
    
    public String highestRated(String cuisine)
    {
        return cuisine_map.get(cuisine).firstEntry().getValue().first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
