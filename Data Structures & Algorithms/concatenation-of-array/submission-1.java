class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int N = 2*n;

        int[] arr = new int[N];

        for(int i = 0; i < n; i++){
            arr[i] = arr[i+n] = nums[i];
        }

        return arr;        
    }
}