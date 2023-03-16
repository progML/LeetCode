package Easy.AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int carry = 0;

        while (lengthA >= 0 || lengthB >= 0 || carry == 1) {
            if(lengthA >= 0)
                carry += a.charAt(lengthA--) - '0';
            if(lengthB  >= 0)
                carry += b.charAt(lengthB--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}