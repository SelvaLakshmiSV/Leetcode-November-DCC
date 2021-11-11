import java.util.*;
class Solution{
    
    public static int minStartValue(int[] nums) 
    {
        Integer min=0,sum=0;
        for(int i:nums){
            sum+=i;
            min=Math.min(min,sum);
        }
        return 1-min;
    }
    
    public static void main(String args[])
    {
         int[]nums={-3,2,-3,4,2};
        int ans=minStartValue(nums);
        System.out.println(ans);
    }
}
