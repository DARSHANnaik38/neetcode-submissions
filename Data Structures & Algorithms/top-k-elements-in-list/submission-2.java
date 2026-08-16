class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Example declaration using a HashMap to compare frequency counts:
        Map<Integer , Integer> map = new HashMap<>();
        int[] ans = new int[k];
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(int x : nums) {
            map.put(x , map.getOrDefault(x , 0) + 1);
        }

        for(int num : map.keySet()) {
            pq.add(num);
        if(pq.size() > k) {
            pq.poll();
        }
        }
        for(int i = 0 ; i < k ; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}
