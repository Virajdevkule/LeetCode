class Solution {
    public int maxArea(int[] h) {
        
        int n = h.length;
        int lp = 0 ; 
        int rp = n-1;
        int MaxWater = 0 ;
        

        while(lp < rp ){
            int w = rp - lp ;
            int ht = Math.min(h[lp] , h[rp]);
            int area = ht * w ;
            MaxWater = Math.max(MaxWater , area);

            if(h[lp] < h[rp] ){
                lp++;
            }else{
                rp--;
            }

        }
        return MaxWater;
    }
}