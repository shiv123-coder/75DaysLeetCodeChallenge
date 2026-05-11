class Solution {
    public String decodeString(String s) {

        while (s.contains("[")) {

            int close = s.indexOf(']');
            int open = s.lastIndexOf('[', close);

            int numStart = open - 1;

            while (numStart >= 0 && Character.isDigit(s.charAt(numStart))) {
                numStart--;
            }

            numStart++;

            int num = Integer.parseInt(s.substring(numStart, open));

            String word = s.substring(open + 1, close);

            String repeated = "";

            for (int i = 0; i < num; i++) {
                repeated += word;
            }

            s = s.substring(0, numStart) + repeated + s.substring(close + 1);
        }

        return s;
    }
}