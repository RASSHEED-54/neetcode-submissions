class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] maxArr = new int[n-k+1];
        int currMax;
        int index = 0;
        for(int i=0; i<=n-k; i++){
            currMax = Integer.MIN_VALUE;
            if(index == maxArr.length){
                break;
            }            
            for(int j=i; j<i+k; j++){
                if(arr[j] > currMax){
                    currMax = arr[j];
                }
            }
            maxArr[index++] = currMax;                        
        }
        return maxArr;
    }
}
