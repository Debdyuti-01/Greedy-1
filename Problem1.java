// Time Complexity : 0(n) 
// Space Complexity : 0(1) 
/
class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return true;
        }
        int n = nums.length;
        int destination = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= destination) {
                destination = i;
            }
        }
        return destination == 0;      
    }
}