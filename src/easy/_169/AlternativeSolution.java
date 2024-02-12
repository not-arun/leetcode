package easy._169;

public class AlternativeSolution {

    // Boyer-Moore's majority vote algorithm
    public int majorityElement(int[] nums) {

        int count = 1;
        int candidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != candidate) {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count++;
                }
            } else {
                count++;
            }
        }
        return candidate;
    }
}
