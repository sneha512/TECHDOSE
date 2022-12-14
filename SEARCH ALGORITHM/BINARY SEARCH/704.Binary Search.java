class Solution {
  public static int BinarySearch(int[] nums, int target) {
    int pivot, left = 0, right = nums.length - 1;
    while(left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target){
        return pivot;
      }
      else if (target < nums[pivot]){ 
        right = pivot - 1;
      }
      else{
        left = pivot + 1;
      }
    }
    return -1;
  }
 
//TIME COMPLEXITY
//BC:O(1)
//WC:O(logN)
