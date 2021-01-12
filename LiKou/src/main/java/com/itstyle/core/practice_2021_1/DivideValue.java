package com.itstyle.core.practice_2021_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给你一个变量对数组 equations 和一个实数值数组 values 作为已知条件，其中 equations[i] = [Ai, Bi] 和 values[i] 共同表示等式 Ai / Bi = values[i] 。每个 Ai 或 Bi 是一个表示单个变量的字符串。
 *
 * 另有一些以数组 queries 表示的问题，其中 queries[j] = [Cj, Dj] 表示第 j 个问题，请你根据已知条件找出 Cj / Dj = ? 的结果作为答案。
 *
 * 返回 所有问题的答案 。如果存在某个无法确定的答案，则用 -1.0 替代这个答案。
 *
 * 注意：输入总是有效的。你可以假设除法运算中不会出现除数为 0 的情况，且不存在任何矛盾的结果。
 *
 * 示例 1：
 *
 * 输入：equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * 输出：[6.00000,0.50000,-1.00000,1.00000,-1.00000]
 * 解释：
 * 条件：a / b = 2.0, b / c = 3.0
 * 问题：a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
 * 结果：[6.0, 0.5, -1.0, 1.0, -1.0 ]
 * 示例 2：
 *
 * 输入：equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
 * 输出：[3.75000,0.40000,5.00000,0.20000]
 * 示例 3：
 *
 * 输入：equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
 * 输出：[0.50000,2.00000,-1.00000,-1.00000]
 *  
 *
 * 提示：
 *
 * 1 <= equations.length <= 20
 * equations[i].length == 2
 * 1 <= Ai.length, Bi.length <= 5
 * values.length == equations.length
 * 0.0 < values[i] <= 20.0
 * 1 <= queries.length <= 20
 * queries[i].length == 2
 * 1 <= Cj.length, Dj.length <= 5
 * Ai, Bi, Cj, Dj 由小写英文字母与数字组成
 *
 */
public class DivideValue {


    public static void main(String[] args) {

        List<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");

        List<String> b = new ArrayList<String>();
        b.add("b");
        b.add("c");

        List<List<String>> equations = new ArrayList<List<String>>();
        equations.add(a);
        equations.add(b);

        double[] values = {2.0, 3.0};


        List<String> c = new ArrayList<String>();
        c.add("a");
        c.add("c");

        List<String> d = new ArrayList<String>();
        d.add("b");
        d.add("a");

        List<String> e = new ArrayList<String>();
        e.add("a");
        e.add("e");

        List<String> f = new ArrayList<String>();
        f.add("b");
        f.add("a");

        List<String> g = new ArrayList<String>();
        g.add("x");
        g.add("x");


        List<List<String>> queries = new ArrayList<List<String>>();
        queries.add(c);
        queries.add(d);
        queries.add(e);
        queries.add(f);
        queries.add(g);

        double[] doubles = calcEquation(equations, values, queries);
        System.out.println(doubles);
    }



    /**
     * 存储结构   {a : [{b: }, {c: }]}
     *
     * @param equations
     * @param values
     * @param queries
     * @return
     */
    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Map<String, Double>>> tem = new HashMap<String, List<Map<String, Double>>>();

        for (List<String> equation : equations) {
            if (tem == null || tem.size() <= 0) {
                tem = new HashMap<String, List<Map<String, Double>>>();
                List<Map<String, Double>> v1 = new ArrayList<Map<String, Double>>();
                Map<String, Double> temMap = new HashMap<String, Double>();
                temMap.put(equation.get(1), values[0]);
                v1.add(temMap);
                tem.put(equation.get(0), v1);

                v1 = new ArrayList<Map<String, Double>>();
                temMap = new HashMap<String, Double>();
                temMap.put(equation.get(0), Double.parseDouble(1 / values[0] + ""));
                v1.add(temMap);
                tem.put(equation.get(1), v1);
            }
            else {
                if (tem.containsKey(equation.get(0))) {
                    List<Map<String, Double>> maps = tem.get(equation.get(0));
                    Map<String, Double> temMap = new HashMap<String, Double>();
                    temMap.put(equation.get(1), values[0]);
                    maps.add(temMap);
                }
                else {
                    List<Map<String, Double>> v1 = new ArrayList<Map<String, Double>>();
                    Map<String, Double> temMap = new HashMap<String, Double>();
                    temMap.put(equation.get(1), values[0]);
                    v1.add(temMap);
                    tem.put(equation.get(0), v1);
                }
                if (tem.containsKey(equation.get(1))) {
                    List<Map<String, Double>> maps = tem.get(equation.get(1));
                    Map<String, Double> temMap = new HashMap<String, Double>();
                    temMap.put(equation.get(0), Double.parseDouble(1 / values[0] + ""));
                    maps.add(temMap);
                }
                else {
                    List<Map<String, Double>> v1 = new ArrayList<Map<String, Double>>();
                    Map<String, Double> temMap = new HashMap<String, Double>();
                    temMap.put(equation.get(0), Double.parseDouble(1 / values[0] + ""));
                    v1.add(temMap);
                    tem.put(equation.get(1), v1);
                }
            }
        }

        System.out.println(tem);
        System.out.println(equations);
        System.out.println(values);
        System.out.println(queries);

        return null;
    }


    public Map<String, Double> getMapValue(String key, Double vaule) {
        return null;
    }
}
