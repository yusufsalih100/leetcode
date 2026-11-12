class Solution {
    public int climbStairs(int n) {
        int[] list = new int[46];
        list[1]=1;
        list[2]=2;
        list[3]=3;
        for (int i=4; i<=n; i++) {
            list[i]=list[i-1]+list[i-2];
        }
        return list[n];
    }
}