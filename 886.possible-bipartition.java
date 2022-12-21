class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        if (dislikes.length == 0) {
            return true;
        }

        int[] label = new int[n + 1];
        label[dislikes[0][0]] = 1;
        label[dislikes[0][1]] = -1;
        boolean[] isChecks = new boolean[dislikes.length];
        isChecks[0] = true;

        while (true) {
            boolean isUpdated = false;

            for (int i = 1; i < dislikes.length; i++) {

                if (isChecks[i]) {
                    continue;
                }

                int a = dislikes[i][0];
                int b = dislikes[i][1];

                if (label[a] != 0 || label[b] != 0) {

                    if (label[a] == label[b]) {
                        return false;

                    } else if (label[a] == -label[b]) {
                        isChecks[i] = true;

                    } else if (label[a] != 0) {
                        label[b] = -label[a];

                    } else if (label[b] != 0) {
                        label[a] = -label[b];
                    }

                    isUpdated = true;
                }
            }

            boolean isAllCheck = true;
            for (int i = 1; i < dislikes.length; i++) {
                if (!isChecks[i]) {
                    isAllCheck = false;
                    break;
                }
            }

            if (isAllCheck) {
                return true;
            }

            if (!isUpdated) {
                for (int i = 1; i < dislikes.length; i++) {

                    if (!isChecks[i]) {
                        label[dislikes[i][0]] = 1;
                        label[dislikes[i][1]] = -1;
                        break;
                    }
                }
            }
        }
    }
}
