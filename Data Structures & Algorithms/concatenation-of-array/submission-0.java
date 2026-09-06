class Solution {
    public int[] getConcatenation(int[] nums) {
        int N = 2*nums.length;

        int[] arr = new int[N];

        int index = 0;
        for(int i = 1; i <= 2; i++){
            for(int num : nums){
                arr[index++] = num;
            }
        }

        return arr;        
    }
}