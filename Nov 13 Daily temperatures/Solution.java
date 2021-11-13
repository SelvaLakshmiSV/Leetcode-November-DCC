class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&& temperatures[stack.peek()]<temperatures[i]){
                temperatures[stack.peek()]=i-stack.pop();
            }
            if(i<temperatures.length-1&& temperatures[i+1]>temperatures[i]){
                temperatures[i]=1;
            }else{
            stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            temperatures[stack.pop()]=0;
        }
        return temperatures;
    }
}
