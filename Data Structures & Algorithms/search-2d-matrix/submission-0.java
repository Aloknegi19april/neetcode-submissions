class Solution {

    public int searchRow(int[][] matrix, int target,
                         int top, int bottom) {

        // Base case
        if (top > bottom) {
            return -1;
        }

        int mid = top + (bottom - top) / 2;

        int rowStart = matrix[mid][0];
        int rowEnd = matrix[mid][matrix[0].length - 1];

        // Target belongs to this row
        if (target >= rowStart && target <= rowEnd) {
            return mid;
        }

        // Search upper half
        else if (target < rowStart) {
            return searchRow(matrix, target,
                             top, mid - 1);
        }

        // Search lower half
        else {
            return searchRow(matrix, target,
                             mid + 1, bottom);
        }
    }

    public boolean searchCol(int[][] matrix, int target,
                             int row, int left, int right) {

        // Base case
        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;

        if (target == matrix[row][mid]) {
            return true;
        }

        else if (target < matrix[row][mid]) {

            return searchCol(matrix, target,
                             row, left, mid - 1);
        }

        else {

            return searchCol(matrix, target,
                             row, mid + 1, right);
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = searchRow(matrix, target,
                            0, matrix.length - 1);

        // Target not present in any row
        if (row == -1) {
            return false;
        }

        return searchCol(matrix, target,
                         row, 0,
                         matrix[0].length - 1);
    }
}