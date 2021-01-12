package com.itstyle.core.Practice_20_12_22;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TheSumOfTwo {

    public static void main(String[] args) {

        ListNode listNode = makeNode(2, 4, 3);
        ListNode listNode1 = makeNode(5, 6, 4);

        ListNode listNode2 = addTwoNumbers2(listNode, listNode1);
        System.out.println(listNode2);

    }

    //方法一: 第一版
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        Integer[] arrays1 = getArrays(l1);
        Integer[] arrays2 = getArrays(l2);
        int length = arrays1.length > arrays2.length ? arrays1.length : arrays2.length;
        int[] result = new int[length + 1];
        for (int i = 0; i < length; i++) {
            if (i < arrays1.length && i < arrays2.length) {
                if (result[i] + arrays1[i] + arrays2[i] >= 10) {
                    result[i] = result[i] + arrays1[i] + arrays2[i] - 10;
                    result[i + 1] = 1;
                }
                else {
                    result[i] = result[i] + arrays1[i] + arrays2[i];
                }
            }
            else if (i < arrays1.length && i >= arrays2.length) {
                if (result[i] + arrays1[i] >= 10) {
                    result[i] = result[i] + arrays1[i] - 10;
                    result[i + 1] = 1;
                }
                else {
                    result[i] = result[i] + arrays1[i];
                }

            }
            else if (i >= arrays1.length && i < arrays2.length) {
                if (result[i] + arrays2[i] >= 10) {
                    result[i] = result[i] + arrays2[i] - 10;
                    result[i + 1] = 1;
                }
                else {
                    result[i] = result[i] + arrays2[i];
                }
            }
            else {
                break;
            }
        }
        return makeNode(result);
    }

    /**
     * 将ListNode转成数组
     * @param node
     * @return
     */
    private static Integer[] getArrays(ListNode node) {
        List<Integer> result = new ArrayList<Integer>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result.toArray(new Integer[result.size()]);
    }


    //创建链表
    public static ListNode makeNode(int... args) {
        if (null == args || args.length == 0) return null;
        ListNode listNode = new ListNode(args[0]);
        ListNode head = listNode;
        for (int i = 1; i < args.length; i++) {
            ListNode node = new ListNode(args[i]);
            if (i == args.length - 1 && node.val == 0) {
                break;
            }
            listNode.next = node;
            listNode = node;

        }
        return head;
    }



    //方法二： 优化版
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            listNode.next = new ListNode((x + y + flag) % 10);
            flag = (x + y + flag) / 10;
            listNode = listNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (flag > 0) {
            listNode.next = new ListNode(flag);
        }
        return head.next;
    }


}
