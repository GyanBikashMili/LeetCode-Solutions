class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] target = new int[size];
        
        for (int i = 0; i < size; i++) {
            target[i] = nums[nums[i]];
        }
        
        return target;
    }
}
