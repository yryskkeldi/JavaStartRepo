package my_package;

public class MyCode {
    public static void main(String[] args) {

        String str = "hello world";
    }

    public String myUpperCase(String word, int beginIndex, int endIndex) {

        String upperWord = word.substring(beginIndex, endIndex).toUpperCase();

        if (beginIndex > 0) {
            return word.substring(0, beginIndex) + upperWord + word.substring(endIndex);
        }
        return upperWord + word.substring(endIndex);
    }


    public static String myLowerCase(String word, int beginIndex, int endIndex) {

        String lowerWord = word.substring(beginIndex, endIndex).toLowerCase();

        if (beginIndex > 0) {
            return word.substring(0, beginIndex) + lowerWord + word.substring(endIndex);
        }
        return lowerWord + word.substring(endIndex);
    }
}





























































