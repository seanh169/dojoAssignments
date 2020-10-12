/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    
    let i = 0;
    while(i < nums.length) {
        if(nums[i] === val) {
            nums.splice(i, 1);
        }else{
            ++i;
        }
    }

    return nums;
};

console.log(removeElement([3,2,2,3], 3))

// pointer 1 = 0 
// pointer 2  = 0

// ---

// pointer 2 = 1
// [2, 2, 2, 3]
// pointer 1 = 1

// [2,2,2,3]
// pointer 1 = 2