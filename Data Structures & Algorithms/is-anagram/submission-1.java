class Solution {
    public boolean isAnagram(String s, String t) {
    //    char[] arr1 = s.toCharArray();
    //    char[] arr2 = t.toCharArray();

    //    Arrays.sort(arr1);
    //    Arrays.sort(arr2);

    //    return Arrays.equals(arr1 , arr2);
    if(s.length() != t.length()) {
        return false;
    }


    Map<Character,Integer> map = new HashMap<>();
    for(char ch : s.toCharArray()) {
        map.put(ch , map.getOrDefault(ch , 0) + 1);
    }

    for(char ch : t.toCharArray()) {
        if(!map.containsKey(ch)) {
            return false;
        }

        map.put(ch , map.get(ch) - 1);
        if(map.get(ch) < 0) {
            return false;
        }
    }
    return true;

    }
}
