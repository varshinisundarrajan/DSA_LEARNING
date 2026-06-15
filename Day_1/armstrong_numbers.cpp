class Solution {
  public:
    bool armstrongNumber(int n) {
        // code here
        int temp=n,sum=0;
        while(temp!=0)
        {
            int d=temp%10;
             sum+=d*d*d;
            temp=temp/10;
            
        }
       return n==sum;
    }
};