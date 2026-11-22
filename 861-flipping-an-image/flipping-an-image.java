class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
            int rows = image.length;
        int cols = image[0].length;

        // Iterate through each row
        for (int i = 0; i < rows; i++) {
            // Flip the row horizontally
            for (int j = 0; j < (cols + 1) / 2; j++) {
                // Swap the pixels
                int temp = image[i][j];
                image[i][j] = image[i][cols - 1 - j] ^ 1; // Flipping and inverting
                image[i][cols - 1 - j] = temp ^ 1; // Flipping and inverting
            }
        }

        return image;
    }
}