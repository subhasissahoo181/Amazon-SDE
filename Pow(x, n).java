class Solution {
    public double myPow(double x, int n) {
        long m = n;
        double a = 1.0;

        if(m < 0){
            m = -1 * m;
        }
        while(m > 0){
            if(m%2 == 1){
                a = a*x;
                m = m-1;
            }
            else{
                x = x*x;
                m = m/2;
            }
        }
        if(n < 0){
            a = (double)(1.0)/(double)(a);
        }
        return a;
        
    }
}