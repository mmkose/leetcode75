class Solution {
    public String reverseVowels(String s) {
        List<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('e');
        letters.add('i');
        letters.add('o');
        letters.add('u');
        letters.add('A');
        letters.add('E');
        letters.add('I');
        letters.add('O');
        letters.add('U');
        List<Integer> vowelIndex = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(letters.contains(s.charAt(i)))
                vowelIndex.add(i);
        }
        char[] charArray = s.toCharArray();
        for(int i = 0; i < vowelIndex.size(); i++){
            charArray[vowelIndex.get(i)] = s.charAt(vowelIndex.get(vowelIndex.size() - i - 1));
            
        }
        String result = new String(charArray);
        return result;
    }
}