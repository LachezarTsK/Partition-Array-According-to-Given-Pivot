
#include <vector>
using namespace std;

class Solution {
    
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {

        vector<int> lessThanPivot;
        vector<int> greaterThanPivot;

        for (auto const& n : nums) {
            if (n < pivot) {
                lessThanPivot.push_back(n);
            } else if (n > pivot) {
                greaterThanPivot.push_back(n);
            }
        }

        int index = 0;
        int equalToPivot = nums.size() - (lessThanPivot.size() + greaterThanPivot.size());

        for (auto const& n : lessThanPivot) {
            nums[index++] = n;
        }
        while (equalToPivot-- > 0) {
            nums[index++] = pivot;
        }
        for (auto const& n : greaterThanPivot) {
            nums[index++] = n;
        }
        return nums;
    }
};
