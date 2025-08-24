class Solution {
    public double myPow(double x, int n) {
        long exp =n;
       if(exp<0) {
        x=1/x;
        exp=-exp;
       }
       return pow(x,exp);
    }

    public double pow(double x , long exp) {
        if(exp == 0) {
            return 1.0;
        }
        double half = pow(x, exp/2);
        if(exp%2==0){
            return half*half;
        } else {
            return half*half *x; 
        }
    }
}