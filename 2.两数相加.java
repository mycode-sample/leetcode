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
        for (int i = 0; i < size; i++) {
            num = num + list.get(i) * pow(10, i);
        }
        return num;

    }

    public int pow(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }

    public ListNode getListNode(int num) {
        ListNode headNode = new ListNode(0, new ListNode());
        ListNode currentNode = headNode.next;
        ListNode tailNode = headNode;
        // num - 1 >=0说明数字还没有拆分完成
        while (num - 1 >= 0) {
            int n = num % 10;
            num = num / 10;
            currentNode.val = n;
            // 最后一位不需要后继节点
            // 还有最后一位
            ListNode nextNode = new ListNode();
            tailNode = currentNode;
            currentNode.next = nextNode;
            currentNode = currentNode.next;
        }
        tailNode.next = null;
        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode la1 = new ListNode(9);
        ListNode la2 = new ListNode(9, la1);
        ListNode la3 = new ListNode(9, la2);
        ListNode la4 = new ListNode(9, la3);
        ListNode la5 = new ListNode(9, la4);
        ListNode la6 = new ListNode(9, la5);
        ListNode la7 = new ListNode(9, la6);

        ListNode lb1 = new ListNode(9);
        ListNode lb2 = new ListNode(9, lb1);
        ListNode lb3 = new ListNode(9, lb2);
        ListNode lb4 = new ListNode(9, lb3);

        Solution s = new Solution();
        ListNode result = s.addTwoNumbers(la7, lb4);
        System.out.println(result);
    }
}
// @lc code=end
