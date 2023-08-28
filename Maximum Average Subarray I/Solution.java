class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0, maxAvg;
        for(int i = 0; i < k; i++){
            avg += nums[i];
        }
        maxAvg = avg;
        for(int i = k; i < nums.length; i++){
            avg = avg  - nums[i - k] + nums[i];
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg / k;
    }
}
