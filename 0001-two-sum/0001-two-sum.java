class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();

        map.put(nums[0],0);
        int[] ans=new int[2];
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            else map.put(nums[i],i);
        }
        return ans;
    }
}