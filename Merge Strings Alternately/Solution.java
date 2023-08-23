package leetcode;

public class Solution {
	public String mergeAlternately(String word1, String word2) {
        
        String result = "";
        if(word1.length() == word2.length()){
            for(int i = 0; i<word1.length(); i++){
                result = result + word1.charAt(i);
                result = result + word2.charAt(i);
            }
        } else if(word1.length() > word2.length()){
            for(int i = 0; i<word1.length(); i++){
                result = result + word1.charAt(i);
                if(i < word2.length())
                    result = result + word2.charAt(i);
            }
        } else if(word1.length() < word2.length()){
            for(int i = 0; i<word2.length(); i++){
                if(i < word1.length())
                    result = result + word1.charAt(i);
                result = result + word2.charAt(i);
            }
        }
        return result;
    }
}
