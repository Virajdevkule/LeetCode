class Solution {
    public double myPow(double x, int n) {
        if(n == 0 ) return 1.0 ;
        if(x == 1 ) return 1.0 ; 
        if(x == 0 ) return 0.0 ;
        if(x == -1 && n % 2 == 0 ) return 1.0 ;
        if(x == -1 && n % 2 != 0 ) return -1.0 ;

        long binfrom = n ;
        double ans = 1 ;
        if ( n < 0 ){
            x = 1/x ;
            binfrom = - binfrom ;
        } 

        while(binfrom > 0 ){
            if (binfrom % 2 == 1 ){
                ans = ans * x ;
            }
            x = x * x ;
            binfrom = binfrom / 2 ;
        }
        return ans ;
        
    }
}