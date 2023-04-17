/*
 * @lc app=leetcode.cn id=1 lang=javascript
 *
 * [1] 两数之和
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  var length = nums.length;
  for (i = 0; i < length; i++) {
    for (j = i + 1; j < length; j++) {
      if (nums[i] + nums[j] == target) {
        return [i, j];
      }
    }
  }
};
// @lc code=end

var target = twoSum([3, 2, 4], 6);
console.log(target);
