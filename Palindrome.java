public class Palindrome {

    public static void main(String[] args) {
        String s = "radar";
        String s1 = "hello";
        System.out.println(isPalindromeString(s));
        System.out.println(isPalindromeString(s1));

        int num = 969;
        int num1 = 72943;
        System.out.println(isPalindromeInteger(num));
        System.out.println(isPalindromeInteger(num1));
    }

    public static boolean isPalindromeString(String s) {
        StringBuilder builder = new StringBuilder();
        String[] letters = s.split("");
        for (int i = letters.length - 1; i >= 0; i--) {
            builder.append(letters[i]);
        }
        if (s.equals(builder.toString())) {
            return true;
        }
        return false;
    }

    public static boolean isPalindromeInteger(int num) {
        StringBuilder builder = new StringBuilder();
        String[] numbers = String.valueOf(num).split("");
        for (int i = numbers.length - 1; i >= 0; i--) {
            builder.append(numbers[i]);
        }
        if (String.valueOf(num).equals(builder.toString())) {
            return true;
        }
        return false;
    }
}
