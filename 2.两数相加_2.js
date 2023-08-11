const { lc1 } = require('./2.两数相加_1');
const { ListNode } = lc1;

/*
 * @lc app=leetcode.cn id=2 lang=javascript
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
  var headNode;
  var currentNode = headNode;
  // 进位
  var c = 0;
  // 当前位相加后的值
  var currentSum;
  // 当前位的值
  var currentNodeValue;
  var v1 = l1.val === undefined ? 0 : l1.val;
  var v2 = l2.val === undefined ? 0 : l2.val;
  var n1 = l1.next;
  var n2 = l2.next;
  while (v1 || v2) {
    // v1或v2只要一个不为空就要计算
    currentSum = v1 + v2 + c;
    c = 0;
    currentNodeValue = currentSum % 10;
    c = currentSum / 10;
    // 创建节点
    currentNode = new ListNode(currentNodeValue, new ListNode());
    currentNode = currentNode.next;
    v1 = n1.val === undefined ? 0 : n1.val;
    v2 = n2.val === undefined ? 0 : n2.val;
    n1 = n1.next;
    n2 = n2.next;
  }
  return headNode;
};
// @lc code=end

exports.lc2 = {
  addTwoNumbers
};
