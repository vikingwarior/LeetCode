class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] path = new boolean[n];
        boolean processed = true;
        path[source] = true;
        while(!path[destination]&&processed)
        {
            processed = false;
            for(int[] edge : edges)
            {
                int a = edge[0];
                int b = edge[1];
                if(path[a]^path[b])
                {
                    processed = true;
                    path[a] = true;
                    path[b] = true;
                }
            }
        }
        return path[destination];
    }
}
