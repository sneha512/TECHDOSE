class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0,max=Integer.MIN_VALUE;
        for(int val:nums){
            currSum+=val;
            if(currSum>max){
                max=currSum;
            }
            if(currSum<0){
             currSum=0;;
            }
        }
        return max;
    }
}
