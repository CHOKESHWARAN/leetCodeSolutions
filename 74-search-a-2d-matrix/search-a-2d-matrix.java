class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;        
        int n = matrix[0].length;     
        
        int s = 0;
        int l = (m * n) - 1;          
        
        while (s <= l) {
            int mid = s + (l - s) / 2;
             
            int row = mid / n;
            int col = mid % n;
            
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                l = mid - 1;         
            } else {
                s = mid + 1;          
            }
        }
        
        return false;
    }
}