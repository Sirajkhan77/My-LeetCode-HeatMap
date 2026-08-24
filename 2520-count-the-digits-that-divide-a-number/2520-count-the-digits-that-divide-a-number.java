class Solution {
    public int countDigits(int num) {
        int c=0;
        int x=num;
        while (x>0){
            int dig = x%10;
            if (num%dig==0) c++;
            x = x/10;
        }
        return c;
    }
}