class Solution {
    
    HashMap<Integer, List<Integer>> rowPairs = new HashMap<>();
    HashMap<Integer, List<Integer>> colPairs = new HashMap<>();
    
    public int removeStones(int[][] stones) {
        for (int i=0; i<stones.length; i++) {
            int r = stones[i][0];
            int c = stones[i][1];
            
            List<Integer> cols = rowPairs.getOrDefault(r, new ArrayList<>());
            cols.add(c);
            
            List<Integer> rows = colPairs.getOrDefault(c, new ArrayList<>());
            rows.add(r);
            
            rowPairs.put(r, cols);
            colPairs.put(c, rows);
        }
        
        int res = stones.length;
        HashSet<Pair<Integer, Integer>> set = new HashSet<>();
        
        for (int i=0; i<stones.length; i++) {
            int r = stones[i][0];
            int c = stones[i][1];
            
            if (set.contains(getPair(r, c))) continue;
            
            traverse(r, c, set);
            res -= 1;
        }
        
        return res;
    }
    
    void traverse(int r, int c, HashSet<Pair<Integer, Integer>> set) {        
        List<Integer> cols = rowPairs.get(r);
        
        for (int i=0; i<cols.size(); i++) { 
            if (set.contains(getPair(r, cols.get(i)))) continue;
            
            set.add(getPair(r, cols.get(i)));
            traverse(r, cols.get(i), set);
        }
        
        
        List<Integer> rows = colPairs.get(c);
        
        for (int i=0; i<rows.size(); i++) {
            if (set.contains(getPair(rows.get(i), c))) continue;
            
            set.add(getPair(rows.get(i), c));
            traverse(rows.get(i), c, set);
        }
    }
    
    Pair<Integer, Integer> getPair(int r, int c) {
        return new Pair<Integer, Integer>(r, c);
    }
    
}

/*
            column 
             1  2   
    row: 1 [[0, 0],
            
         2  [0, 1],
            
         3  [1, 0],
            
         4  [1, 2],
            
         5  [2, 1],
            
         6  [2, 2]]
*/