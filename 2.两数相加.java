/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int t = getNum(l1) + getNum(l2);
        return getListNode(t);
    }

    public int getNum(ListNode l1) {
        List<Integer> list = new ArrayList<>();
        ListNode currentNode = l1;
        list.add(currentNode.val);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            list.add(currentNode.val);
        }
        int num = 0;
        int size = list.size();
        while (size > 0) {
            num = num + list.get(size) * pow(10, size);
        }
        return 1;
    }

    public int pow(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }

    public ListNode getListNode(int num) {
        ListNode currentNode = null;
        ListNode listNode = currentNode;
        do {
            int n = num % 10;
            num = (int) (num / 10 - n * 0.1);
            ListNode next = new ListNode();
            currentNode = new ListNode(n, next);
            currentNode = next;
        } while (num > 0);
        return listNode;
    }
}
// @lc code=end
