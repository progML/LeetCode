package Easy.ExcelSheetColumnNumber;

class Solution {
    public int titleToNumber(String columnTitle) {
        byte[] a = columnTitle.getBytes();
        int res = a[0] - 64;
        for (int i = 1; i < a.length; i++) {
            res = (res * 26) + (a[i] - 64);
        }
        return res;
    }
}