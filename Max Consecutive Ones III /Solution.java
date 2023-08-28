class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zerosFlipped = 0;
        int maxWindow = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
            zerosFlipped++;
            }
            if (zerosFlipped > k) {
                if (nums[left] == 0) {
                    zerosFlipped--; 
                }
                left++; 
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
            right++;
        }

        return maxWindow;
    }
}
