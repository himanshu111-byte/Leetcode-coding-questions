package dsa;

import java.util.Arrays;

public class HouseRobber {
	int[] memo;
	public int rob(int[] nums) {
		
	    memo = new int[nums.length + 1];
	    Arrays.fill(memo, -1);
	    return rob(nums, nums.length - 1);
	}

	private int rob(int[] nums, int i) {
	    if (i < 0) {
	        return 0;
	    }
	    if (memo[i] >= 0) {
	        return memo[i];
	    }
	    int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
	    memo[i] = result;
	    return result;
	}
	public static void main(String[] args) {
        HouseRobber solution = new HouseRobber();
        
        // Example input values
        int[] nums = {1, 2, 3, 5};
        
        int maxAmount = solution.rob(nums);
        System.out.println("Maximum amount that can be robbed: " + maxAmount);
    }
}


