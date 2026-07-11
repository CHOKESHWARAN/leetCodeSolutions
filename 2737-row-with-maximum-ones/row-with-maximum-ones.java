class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int max = 0;
        int row = 0;

        for (int i = 0; i < rows; i++) {
            int count = 0;

            for (int j = 0; j < cols; j++) {
                count += mat[i][j];
            }

            if (count > max) {
                max = count;
                row = i;
            }
        }

        return new int[]{row, max};
    }
}