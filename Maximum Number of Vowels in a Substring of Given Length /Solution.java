class Solution {
    public int maxVowels(String s, int k) {
        String vowelLetters = "aeiou";
        int vowCount = 0, maxCount = 0;
        char ch;
        for(int i = 0; i < k; i++){
            ch = s.charAt(i);
            if(vowelLetters.contains(String.valueOf(ch)))
                vowCount++;
        }
        maxCount = vowCount;
        for(int i = k; i < s.length(); i++){
            ch = s.charAt(i);
            if(vowelLetters.contains(String.valueOf(ch)))
                vowCount++;
            ch = s.charAt(i-k);
            if(vowelLetters.contains(String.valueOf(ch)))
                vowCount--;
            maxCount = Math.max(maxCount, vowCount);
        }

        return maxCount;   
    }
}
