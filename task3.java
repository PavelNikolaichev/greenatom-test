public class ValidPalindrome {
    public static void main(String[] args) {
        String str1 = "nascar";
        String str2 = "bonk";
        
        System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
    }
    
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();

        return str.equals(reversedStr);
    }

    public static boolean myIsPalindrome(String str) {
        str = str.toLowerCase(); 
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
