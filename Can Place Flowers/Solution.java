class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int a = 0;
        if(flowerbed.length == 1 && flowerbed[0] == 0){
            if(n <= 1) return true;
            else return false;
        } 
        else if(flowerbed.length == 1){ 
            if(n <= 0) return true;
            else return false;
        }
        for(int i = 0; i < flowerbed.length; i++){
            if(i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                a++;
                flowerbed[i] = 1;
            }
            else if(i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                a++;
                flowerbed[i] = 1;
            }else if(i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0){
                a++;
                flowerbed[i] = 1;
            }
                
        }
        if(n <= a) return true;
        else return false;
        
    }
}