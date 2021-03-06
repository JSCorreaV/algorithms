package leetcode;

public class MaximumProduct {

    /**
     * Given the array of integers nums,
     * it will choose two different indices i and j of that array.
     * and return the maximum value of (nums[i]-1)*(nums[j]-1).
     *
     * @param nums array of integers
     * @return maximum value of (nums[i]-1)*(nums[j]-1)
     */
    public int maxProduct(int[] nums) {
        int first = nums[0];
        int second = 0;
        for (int n : nums) {
            if (first < n) {
                second = first;
                first = n;
            } else if (second < n) {
                second = n;
            }
        }
        return (first - 1) * (second - 1);
    }

    public static void main(String[] args) {
        MaximumProduct maximumProduct = new MaximumProduct();
        int[] nums = {3, 4, 5, 2};
        System.out.println(maximumProduct.maxProduct(nums));
    }


}
