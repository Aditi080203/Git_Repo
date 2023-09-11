
public class ColumnTitle {
    static String convertTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            result.insert(0, c);
            columnNumber /= 26;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int num = 701;
        System.out.println(convertTitle(num));
    }
}
