import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=2225 lang=java
 *
 * [2225] Find Players With Zero or One Losses
 */

// @lc code=start
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      
      Map<Integer, Integer> lossCount = new HashMap<>();
      Set<Integer> winnerSet = new HashSet<>();
      Set<Integer> loserSet = new HashSet<>();
      
      for (int i = 0; i < matches.length; i++) {
        if(lossCount.containsKey(matches[i][1])) lossCount.replace(matches[i][1], lossCount.get(matches[i][1])+1);
        else lossCount.put(matches[i][1], 1);
      }

      for (int i = 0; i < matches.length; i++) {
            if (!lossCount.containsKey(matches[i][0])) {
                winnerSet.add(matches[i][0]);
            }

            if(lossCount.get(matches[i][1]) == 1) loserSet.add(matches[i][1]);
      }
      
      List<Integer> winners = winnerSet.stream().collect(Collectors.toList());
      List<Integer> losers = loserSet.stream().collect(Collectors.toList());
      
      Collections.sort(winners);
      Collections.sort(losers);
      
      List<List<Integer>> fin = new ArrayList<>();
      fin.add(winners);
      fin.add(losers);
      
      return fin;
    }  
}
// @lc code=end

