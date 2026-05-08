class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        
        if (n > m) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        int windowSize = n;

        for (int i = 0; i < m; i++) {
            count2[s2.charAt(i) - 'a']++;

            if (i >= windowSize) {
                count2[s2.charAt(i - windowSize) - 'a']--;
            }

            if (i >= windowSize - 1) {
                if (matches(count1, count2)) return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}