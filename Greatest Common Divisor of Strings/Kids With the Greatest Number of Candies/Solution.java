class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int newSize = candies.length;
        List<Boolean> boolCandies = new ArrayList<>();;
        int max = 0;
        for(int i : candies){
            if(i > max)
                max = i;
        }
        for(int i : candies){
            if(i + extraCandies >= max)
                boolCandies.add(true);
            else
                boolCandies.add(false);
        }
        return boolCandies;
    }
}