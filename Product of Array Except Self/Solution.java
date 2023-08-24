class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int zeroCount = 0;
        int zeroIndex = -1;
        int[] result = new int[size];
        int x = 1;
        for(int i = 0; i < size; i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
            }
            x *= nums[i];
        }
        for(int i = 0; i < size; i++){
            if(nums[i] != 0)
                result[i] = x / nums[i];
            else
                result[i] = 0;
        }
        if(zeroCount == 1){
            x = 1;
            for(int i = 0; i < size; i++){
                if(i != zeroIndex)
                    x *= nums[i];
            }
            result[zeroIndex] = x;
        }
        return result;
    }
}