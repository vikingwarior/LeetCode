class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        final int[] parents = buildParents(n, edges);
        final int[] childrenCount = new int[n];
        int rootDistance = 0;
        for (int i = n - 1; i > 0; i--) {
        	final int node = q[i];
        	final int c = childrenCount[node] + 1;
        	childrenCount[parents[node]] += c;
        	rootDistance += c;
        }
        final int root = q[0];
        final int[] r = new int[n];
        r[root] = rootDistance;
        for (int i = 1; i < n; i++) {
        	final int node = q[i];
        	r[node] = r[parents[node]] + n - 2 * (childrenCount[node] + 1);
        }
        return r;
    }
	
	static final int[] q = new int[30001];
	
	static int[] buildParents(int n, int[][] edges) {
		final int[][] next = buildNext(n, edges);
        final int[] parents = new int[n];
        Arrays.fill(parents, -1);
        int start = 0, end = 0;
        q[end++] = 0;
        while (start < end) {
        	final int parent = q[start++];
        	for (int c : next[parent]) {
        		if (c != 0 && parents[c] < 0) {
        			parents[c] = parent;
        			q[end++] = c;
        		}
        	}
        }
        parents[0] = -1;
        return parents;
	}
	
	static int[][] buildNext(final int n, final int[][] edges) {
		final int[] counts = new int[n];
		for (final int[] e : edges) {
			counts[e[0]]++;
			counts[e[1]]++;
		}
		final int[][] res = new int[n][];
		for (int i = 0; i < n; i++) {
			res[i] = new int[counts[i]];
		}
		for (final int[] e : edges) {
			final int l = e[0];
			final int r = e[1];
			res[l][--counts[l]] = r;
			res[r][--counts[r]] = l;
		}
		return res;
	}
}
