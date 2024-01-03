class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int k=0;
                    ans[k++] = i;
                    ans[k++] = j;
                }
            }
        }
        return ans;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[] {};
    }
}