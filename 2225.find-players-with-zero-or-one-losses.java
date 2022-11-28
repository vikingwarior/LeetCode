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
      
      Map<Integer, Integer> lossCount = new HashMap<>(); // stores the data of all the losers
      Set<Integer> winnerSet = new HashSet<>();
      Set<Integer> loserSet = new HashSet<>();
      
      // Count losses for all the losers
      for (int i = 0; i < matches.length; i++) {
        if(lossCount.containsKey(matches[i][1])) lossCount.replace(matches[i][1], lossCount.get(matches[i][1])+1);
        else lossCount.put(matches[i][1], 1);
      }

      
      for (int i = 0; i < matches.length; i++) {
            // Checks if winner exists in Map of losers
            if (!lossCount.containsKey(matches[i][0])) {
                winnerSet.add(matches[i][0]);
            }

            // Retirives all the losers with 1 loss and stores their value seperately
            if(lossCount.get(matches[i][1]) == 1) loserSet.add(matches[i][1]);
      }
      
      //Converting the reult into ArrayList as per requirement of submission
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

