class Solution {
    public int missingNumber(int[] nums) {
      int range=nums.length;
      int actualSum=(range*(range+1))/2;  //(n*(n+1))/2
      int currentSum=0;
      for(int i=0;i<nums.length;i++){
         currentSum= currentSum + nums[i];
      }
      int res = actualSum - currentSum;
      return res;

     
    }
}
