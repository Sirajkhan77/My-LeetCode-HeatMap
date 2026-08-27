class Solution {
    public int digitFrequencyScore(int n) {
        int x=n;
        int s=0;
        while(x>0){
            s+=x%10;
            x=x/10;
        }
        return s;
    }
}