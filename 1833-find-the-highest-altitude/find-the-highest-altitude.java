class Solution {
    public int largestAltitude(int[] gain) {

        int[] temp = new int[gain.length + 1];

        temp[0] = 0;

        for(int i = 0; i < gain.length; i++) {
            temp[i + 1] = temp[i] + gain[i];
        }

        int max = Integer.MIN_VALUE;

        for(int j = 0; j < temp.length; j++) {
            if(temp[j] > max) {
                max = temp[j];
            }
        }

        return max;
    }
}