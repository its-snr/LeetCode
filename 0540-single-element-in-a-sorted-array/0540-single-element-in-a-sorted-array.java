class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        if(n==1)return nums[0];
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        else if( nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
            int mid=(left+right)/2;

        while(left<=right){
            mid=(left+right)/2;

            if(nums[mid+1]!=nums[mid] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2!=0 && nums[mid]==nums[mid-1]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
        
    }
}