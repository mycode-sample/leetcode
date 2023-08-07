public class Solution2Test {
  public static void main(String[] args) {
    int a[] = { 9 };
    int b[] = { 1, 9, 9, 9, 9, 9, 9, 9, 9, 9 };

    Solution s = new Solution();
    ListNode result = s.addTwoNumbers(createListNode(a), createListNode(b));
    System.out.println("执行结果:" + result);
    System.out.println(s.getNum(result));
  }

  private static ListNode createListNode(int[] array) {
    ListNode head = new ListNode();
    ListNode currentNode = head;
    for (int a : array) {
      currentNode.next = new ListNode(a);
      currentNode = currentNode.next;
    }
    return head.next;
  }
}
