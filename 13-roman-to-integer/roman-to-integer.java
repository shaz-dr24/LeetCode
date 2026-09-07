class Solution {

    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int current = 0;

            if (ch == 'I') {
                current = 1;
            }
            else if (ch == 'V') {
                current = 5;
            }
            else if (ch == 'X') {
                current = 10;
            }
            else if (ch == 'L') {
                current = 50;
            }
            else if (ch == 'C') {
                current = 100;
            }
            else if (ch == 'D') {
                current = 500;
            }
            else if (ch == 'M') {
                current = 1000;
            }

            if (i + 1 < s.length()) {

                char next = s.charAt(i + 1);
                int nextValue = 0;

                if (next == 'I') {
                    nextValue = 1;
                }
                else if (next == 'V') {
                    nextValue = 5;
                }
                else if (next == 'X') {
                    nextValue = 10;
                }
                else if (next == 'L') {
                    nextValue = 50;
                }
                else if (next == 'C') {
                    nextValue = 100;
                }
                else if (next == 'D') {
                    nextValue = 500;
                }
                else if (next == 'M') {
                    nextValue = 1000;
                }

                if (current < nextValue) {
                    sum = sum - current;
                }
                else {
                    sum = sum + current;
                }

            }
            else {
                sum = sum + current;
            }
        }

        return sum;
    }
}