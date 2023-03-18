class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int counter=0;

        for(int n : nums1){
            res[counter++]=findingNextBig(n,nums2);
        }
        return res;
    }

    public int findingNextBig(int n, int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==n){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]>n){
                        return nums[j];
                    }
                }
            }
        }
        return -1;
    }
}