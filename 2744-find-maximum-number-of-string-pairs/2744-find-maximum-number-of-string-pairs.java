class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String s= new String(chars);
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int c=0;
        for (int i: map.values()){
            if (i>1) c++;
        }
        return c;
    }
}