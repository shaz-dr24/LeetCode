class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        char[] c1 = s.toCharArray();
        char[] c2 = new char[s.length()];

        int j = 0;

        for (int i = 0; i < c1.length; i++) {

            if (Character.isLetterOrDigit(c1[i])) {

                c2[j] = c1[i];
                j++;
            }
        }

        char[] tempArr = new char[j];

        for (int i = 0; i < j; i++) {
            tempArr[i] = c2[i];
        }

        int start = 0;
        int end = tempArr.length - 1;

        while (start < end) {

            char temp = tempArr[start];
            tempArr[start] = tempArr[end];
            tempArr[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < j; i++) {

            if (c2[i] != tempArr[i]) {
                return false;
            }
        }

        return true;
    }
}