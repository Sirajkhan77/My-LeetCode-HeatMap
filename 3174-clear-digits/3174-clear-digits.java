class Solution {
    public String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int count=0;
        for (int i=s.length()-1; i>=0; i--){
            if (Character.isDigit(s.charAt(i))){
                count++;
                continue;
            }
            else if (count>0){
                count--;
                continue;
            }
            stack.push(s.charAt(i));
            
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}