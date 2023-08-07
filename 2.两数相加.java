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
        // System.out.println("数字:" + num);
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
        // System.out.println("链表:" + headNode.next);
        return headNode.next;
    }
}
// @lc code=end
