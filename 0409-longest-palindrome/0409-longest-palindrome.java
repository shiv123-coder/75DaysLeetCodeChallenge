class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int count = 0;

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        for (int num : freq) {
            count += (num / 2) * 2;
        }

        if (count < s.length()) {
            count++;
        }

        return count;
    }
}