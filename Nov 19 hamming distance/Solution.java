class Solution {
    static int hammingDistance(int x , int y){
        int xor_ = x ^ y;
        int cnt = 0;
        while(xor_ > 0){
            xor_ = (xor_ & (xor_ - 1));
            ++cnt;
        }
        return cnt;
    }
    public static void main(String args[]){
        int x = 5 , y = 2;
        System.out.println(hammingDistance(x , y));
    }
}
