class Solution {
    public int countElements(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min && nums[i]<max){
                c++;
            }
        }
        return c;
    }
}
