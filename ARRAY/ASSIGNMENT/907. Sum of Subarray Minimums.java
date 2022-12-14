class Solution {
      public int sumSubarrayMins(int[] arr) {
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        long res=0;
        for(int i=0;i<arr.length+1;i++){
            int currVal=(i<arr.length)?arr[i]:0;
            while(s.peek()!=-1 && currVal<arr[s.peek()]){ // Monotone Icreasing Stack
                int ind=s.pop();
                int j=s.peek();
                int l=ind-j;
                int r=i-ind;
                long ans=(long)l*r*arr[ind];
                res+=ans;
                res%=1000000007;
            }
            s.push(i);
        }
        return (int)res;
    }
}
