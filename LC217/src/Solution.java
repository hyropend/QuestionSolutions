
//Lösung 1, Solution 1, Çözüm 1

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0 && nums.length==1){
            return false;
        }
        int a=0;
        int b=0;

        for(a=0;a<nums.length;a++){
            for(b=a+1;b<nums.length;b++){
                if(nums[a]==nums[b]){
                    return true;
                }
                else{
                    b++;
                }
            }
        }
        return false;
    }
}

//Lösung 2, Solution 2, Çözüm 2

class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}
