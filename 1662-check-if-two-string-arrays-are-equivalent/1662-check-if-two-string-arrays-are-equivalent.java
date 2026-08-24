class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s: word1){
            for (char c: s.toCharArray()){
                sb1.append(c);
            }
        } 
        for (String s: word2){
            for (char c: s.toCharArray()){
                sb2.append(c);
            }
        } 
        return sb1.toString().equals(sb2.toString());

    }
}