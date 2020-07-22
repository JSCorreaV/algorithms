package leetcode;

public class MaximumProduct {
    public static int maxProduct(int[] nums) {
        int first = nums[0];
        int second = 0;
        for (int n : nums){
            if (first <n){
                second=first;
                first=n;
            }else if(second<n){
                second=n;
            }
        }
        return (first-1)*(second-1);
    }

    public static void main(String[] args){
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }


}
