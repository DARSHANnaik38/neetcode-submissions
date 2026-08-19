class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftproduct = new int[nums.length];
        int[] rightproduct = new int[nums.length];
        leftproduct[0] =1;

        for(int i = 1 ; i < nums.length ; i++) {
            leftproduct[i] = leftproduct[i - 1] * nums[i - 1];
        }
        rightproduct[nums.length - 1] = 1;

        for(int j = nums.length - 2 ; j >= 0 ; j--) {
            rightproduct[j] = rightproduct[j +1] * nums[j + 1];
        }

        int[] ans = new int[nums.length];
        for(int k = 0 ; k < nums.length ; k++) {
            ans[k] = leftproduct[k] * rightproduct[k];
        }

        return ans;
    }
}  
