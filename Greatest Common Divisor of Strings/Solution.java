class Solution {

    static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public String gcdOfStrings(String str1, String str2) {
        String divisor = "";
        int gcd;
        int length1 = str1.length(); 
        int length2 = str2.length();
        gcd = gcd(length1, length2);
        if(gcd == 0)
            return divisor;
        for(int i = 0; i < gcd; i++){
            if(str1.charAt(i) == str2.charAt(i))
                divisor = divisor + str1.charAt(i);
            else
                return "";
        }
        for(int i = 0; i < length1; i++){
            if(divisor.charAt(i%gcd) != str1.charAt(i))
                return "";
        }
        for(int i = 0; i < length2; i++){
            if(divisor.charAt(i%gcd) != str2.charAt(i))
                return "";
        }
        return divisor;
    }
}