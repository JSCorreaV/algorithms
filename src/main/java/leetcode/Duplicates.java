package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicates {

    public List<Integer> cleanDuplicates(int[] nums) {
        return IntStream.of(nums)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     * <p>
     * Find all the elements that appear twice in this array.
     *
     * @param nums
     * @return duplicates
     */
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> items = new HashSet<>();
        return IntStream.of(nums)
                .boxed()
                .filter(n -> !items.add(n))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(duplicates.findDuplicates(nums));
    }
}
