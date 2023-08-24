class Solution {
    public String reverseWords(String s) {
        s += " ";
        String result = "";
        char[] charArray = s.toCharArray();
        Boolean stringStart;
        if(charArray[0] == ' ')
            stringStart = false;
        else
            stringStart = true;
        String word = "";
        for(int i = 0; i < charArray.length; i++){
            if(!stringStart){
                if(charArray[i] == ' ')
                    continue;
                else{
                    stringStart = true;
                    word = word + charArray[i];
                }
            } else{
                if(charArray[i] != ' '){
                    word = word + charArray[i];
                }else{
                    stringStart = false;
                    result = word + " " + result;
                    word = "";
                }
            }
        }
        return result.substring(0, result.length() - 1);
    }
}