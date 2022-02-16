
/**
 * @param {number[]} nums
 * @param {number} pivot
 * @return {number[]}
 */
var pivotArray = function (nums, pivot) {

    const lessThanPivot = [];
    const greaterThanPivot = [];

    for (let n of nums) {
        if (n < pivot) {
            lessThanPivot.push(n);
        } else if (n > pivot) {
            greaterThanPivot.push(n);
        }
    }

    let index = 0;
    let equalToPivot = nums.length - (lessThanPivot.length + greaterThanPivot.length);

    for (let n of lessThanPivot) {
        nums[index++] = n;
    }    
    while (equalToPivot-- > 0) {
        nums[index++] = pivot;
    }    
    for (let n of greaterThanPivot) {
        nums[index++] = n;
    }    
    return nums;
};
