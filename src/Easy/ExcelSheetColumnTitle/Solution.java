package Easy.ExcelSheetColumnTitle;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber -= 1;
            title.append(((char) ((columnNumber % 26) + 65)));
            columnNumber /= 26;
        }
        return title.reverse().toString();
    }

}