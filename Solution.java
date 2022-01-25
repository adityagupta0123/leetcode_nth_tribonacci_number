class Solution {
    public int tribonacci(int n) {
        int[] ls = {0,1,1};
        
        for(int i=3; i<=n; i++){
            ls[i%3] = ls[0] + ls[1] + ls[2];
        }
        return ls[n%3];
    }

}
 
