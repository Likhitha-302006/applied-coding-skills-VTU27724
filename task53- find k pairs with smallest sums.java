import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> result = new ArrayList<>();

      
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

              int limit = Math.min(k, nums1.length);

        for (int i = 0; i < limit; i++) {
            minHeap.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (k > 0 && !minHeap.isEmpty()) {

            int[] current = minHeap.poll();

            int i = current[1];
            int j = current[2];

            result.add(Arrays.asList(nums1[i], nums2[j]));
            k--;

                        if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{
                    nums1[i] + nums2[j + 1],
                    i,
                    j + 1
                });
            }
        }

        return result;
    }
}


Input
nums1 =
[1,7,11]
nums2 =
[2,4,6]
k =
3
Output
[[1,2],[1,4],[1,6]]
Expected
[[1,2],[1,4],[1,6]]
