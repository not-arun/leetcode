package easy._1913;

class Solution {

    public int maxProductDifference(int[] nums) {

        int largest = 0;
        int secondLargest = 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return (largest * secondLargest) - (smallest * secondSmallest);
    }
}