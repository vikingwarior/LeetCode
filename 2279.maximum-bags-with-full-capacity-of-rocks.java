class Solution {
  public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
    final int n = capacity.length;
    for (int i = 0; i < n; i++) {
      capacity[i] -= rocks[i];
    }

    // always pick the smallest left bag
    Arrays.sort(capacity);
    int count = 0;
    for (int i = 0; i < n && additionalRocks > 0; i++) {
      if (additionalRocks >= capacity[i]) {
        count++;
      }
      additionalRocks -= capacity[i];
    }

    return count;
  }
}
