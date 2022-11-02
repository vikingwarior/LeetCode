import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode id=433 lang=java
 *
 * [433] Minimum Genetic Mutation
 */

// @lc code=start
class pair {
  String gene;
  int steps;
  pair(String g, int s) {
    gene = g;
    steps = s;
  }
}

class Solution {

  public int minMutation(String start, String end, String[] bank) {
    Queue<pair> q = new LinkedList<>();
    HashSet<String> set = new HashSet<>(Arrays.asList(bank));
    if (!set.contains(end)) {
      return -1;
    }
    q.add(new pair(start, 0));

    while (!q.isEmpty()) {
      pair p = q.remove();
      if (p.gene.equals(end)) {
        return p.steps;
      }

      set.remove(p.gene);

      for (String str : set) {
        if (valid(str, p.gene)) {
          q.add(new pair(str, p.steps + 1));
        }
      }
    }
    return -1;
  }

  boolean valid(String a, String b) {
    int count = 0;

    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        count++;
      }
      if (count > 1) {
        return false;
      }
    }
    return true;
  }
}
// @lc code=end
