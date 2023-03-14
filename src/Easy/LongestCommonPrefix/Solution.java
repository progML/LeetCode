package Easy.LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        String prefix = "";
        if (strs.length == 1) {
            return temp;
        }
        for (int i = 1; i < strs.length; i++) {
            for (int j = temp.length(); j > 0; j--) {
                temp = temp.substring(0, j);
                if (strs[i].startsWith(temp)) {
                    prefix = temp;
                    break;
                }else {
                    prefix = "";
                }
            }
            if (prefix.isEmpty()){
                break;
            }
        }
        return prefix;
    }
}