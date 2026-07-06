class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
         int candidate =2;
         int n=nums.length;
          for(int i=0;i<n;i++){
if(count ==0){
    candidate=nums[i];
}
 if(nums[i] != candidate){
    count--;
}
if(nums[i]==candidate){
    count++;
}
}
return candidate;
             }
}