class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int currAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currAltitude += gain[i];
            max = Math.max(max, currAltitude);
        }
        return max;
    }
}