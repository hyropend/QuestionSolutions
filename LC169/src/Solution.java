class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0; int res=0;

        for(int n : nums){
            if(cnt==0){
                res=n;
            }
            cnt += (n==res ? 1:-1);
        }
        return res;
    }
}