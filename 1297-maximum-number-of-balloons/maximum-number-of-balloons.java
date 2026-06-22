class Solution {
    public int maxNumberOfBalloons(String text) {

        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;

        char[] c = text.toCharArray();

        for(int i = 0; i < c.length; i++) {

            if(c[i] == 'b')
                countB++;

            else if(c[i] == 'a')
                countA++;

            else if(c[i] == 'l')
                countL++;

            else if(c[i] == 'o')
                countO++;

            else if(c[i] == 'n')
                countN++;
        }

        countL = countL / 2;
        countO = countO / 2;

        int ans = Math.min(countB, countA);
        ans = Math.min(ans, countL);
        ans = Math.min(ans, countO);
        ans = Math.min(ans, countN);

        return ans;
    }
}