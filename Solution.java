
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> lessThanPivot = new ArrayList<>();
        List<Integer> greaterThanPivot = new ArrayList<>();

        for (int n : nums) {
            if (n < pivot) {
                lessThanPivot.add(n);
            } else if (n > pivot) {
                greaterThanPivot.add(n);
            }
        }

        int index = 0;
        int equalToPivot = nums.length - (lessThanPivot.size() + greaterThanPivot.size());

        for (int n : lessThanPivot) {
            nums[index++] = n;
        }
        while (equalToPivot-- > 0) {
            nums[index++] = pivot;
        }
        for (int n : greaterThanPivot) {
            nums[index++] = n;
        }
        return nums;
    }
}
