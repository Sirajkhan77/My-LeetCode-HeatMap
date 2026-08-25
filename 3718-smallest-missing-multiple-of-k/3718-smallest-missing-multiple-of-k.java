class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i =1; i<=101; i++){
            int d= i*k;
            list.add(d);
        }
        boolean[] b= new boolean[101];
        int max=0;
        for (int i: nums){
            if (i>=max) max=i;
             b[i]= true;
        }
        for (int i: list){
            if (i<=max){
                if(!b[i]){
                    return i;
                }
            }else{
                return i;
            }
        }
        return -1;
    }
}