class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] each = str.toCharArray();
            Arrays.sort(each);
            String sorted = new String(each);
            // if(!map.containsKey(sorted)) {
            //     map.put(sorted , new ArrayList<>());
            // }

            // map.get(sorted).add(str); 


            map.computeIfAbsent(sorted , k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}