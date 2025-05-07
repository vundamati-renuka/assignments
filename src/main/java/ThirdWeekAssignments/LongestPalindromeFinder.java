package ThirdWeekAssignments;

public class LongestPalindromeFinder {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // Odd-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);   // Even-length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;  // new start index
                end = i + len / 2;          // new end index
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        // Expand while characters match and indices are valid
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the found palindrome
    }

    public static void main(String[] args) {
        LongestPalindromeFinder finder = new LongestPalindromeFinder();
        System.out.println("Output: " + finder.longestPalindrome("babad"));  // Output: "bab" or "aba"
        System.out.println("Output: " + finder.longestPalindrome("cbbd"));   // Output: "bb"
    }
}

