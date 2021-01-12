package com.itstyle.core.practice_2021_1;

/**
 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 *
 * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
 *
 * 示例 1：
 *
 * 输入：guess = [1,2,3], answer = [1,2,3]
 * 输出：3
 * 解释：小A 每次都猜对了。
 * 示例 2：
 *
 * 输入：guess = [2,2,3], answer = [3,2,1]
 * 输出：1
 * 解释：小A 只猜对了第二次。
 *  
 *
 * 限制：
 *
 * guess 的长度 = 3
 * answer 的长度 = 3
 * guess 的元素取值为 {1, 2, 3} 之一。
 * answer 的元素取值为 {1, 2, 3} 之一。
 *
 */
public class GuessNumber {


    public static void main(String[] args) {
        int[] guess = {2, 1, 3};
        int[] answer = {1, 2, 3};

        int game = game(guess, answer);

        System.out.println(game);
    }

    public static int game(int[] guess, int[] answer) {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            i += guess[j] == answer[j] ? 1 : 0;
        }
        return i;
    }
}
