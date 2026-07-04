class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int upper = matrix[0].length - 1;
        int lower = 0;

        while(lower < matrix.length && upper >= 0){
            if(target > matrix[lower][upper]){
                lower++;
            }
            else if(target < matrix[lower][upper]){
                upper--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
