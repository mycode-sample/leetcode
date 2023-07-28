/*
 * @lc app=leetcode.cn id=2 lang=javascript
 *
 * [2] 两数相加
 */

function ListNode(val, next) {
  this.val = (val === undefined ? 0 : val)
  this.next = (next === undefined ? null : next)
}

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
  // if (l1.length == 0) {
  //   return l2;
  // }
  // if (l2.length == 0) {
  //   return l1;
  // }
  // if (l1.length == 0 && l2.length == 0) {
  //   return 0;
  // }
  var result = getNum(l1) + getNum(l2);
  return getList(result);
};

var getNum = function (listNode) {
  list = [];
  list.push(listNode.val);
  while (listNode.next != undefined) {
    listNode = listNode.next;
    list.push(listNode.val);
  }
  let index = list.length - 1;
  let num = 0;
  while (index >= 0) {
    num = num + list[index] * (10 ** index);
    index--;
  }
  return num;
}

var getList = function getList(num) {
  var listNode;
  var currentNode = listNode;
  do {
    var n = num % 10;
    num = num / 10 - n * 0.1
    nextNode = new ListNode();
    currentNode = new ListNode(n, nextNode);
    currentNode = nextNode;
  } while (num > 0);
  return listNode;
}
// @lc code=end

l1 = {
  val: 2,
  next: {
    val: 4,
    next: {
      val: 3,
    }
  }
};

l2 = {
  val: 5,
  next: {
    val: 6,
    next: {
      val: 4,
    }
  }
}

console.log(getNum(l1))
console.log(getNum(l2));
var result = addTwoNumbers(l1, l2);
console.log(result);
console.log(typeof result);
