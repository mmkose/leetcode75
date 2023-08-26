class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> temp = new ArrayList();
        int zeroStart = 0;
        for(int i : nums){
            if(i == 0){
                temp.add(i);
            } else{
                temp.add(zeroStart, i);
                zeroStart++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp.get(i);
        }
        
    }
}