class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end =heights.length - 1;

        int maxArea = 0;

        while(start < end){
            int h = Math.min(heights[start],heights[end]);
            int w = end - start;
            int currentArea = h * w;
            maxArea = Math.max(currentArea,maxArea);
            if(heights[start] < heights[end]){
                start++;
            }
            else{
                end--;
            }
        }

        return maxArea;
    }
}
