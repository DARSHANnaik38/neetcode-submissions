class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            int length = str.length();
            sb.append(length + "#" + str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int delimeter = str.indexOf('#' , i);
            String lengthstr = str.substring(i , delimeter);
            int length = Integer.parseInt(lengthstr);
            int index = delimeter + 1;
            String word = str.substring(index, index + length);

            result.add(word);
            i = index + length;


        }
        return result;

    }
}
