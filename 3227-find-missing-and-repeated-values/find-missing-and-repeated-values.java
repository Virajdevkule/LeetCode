class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0 ;
        int b = 0 ;
        int n = grid.length;
        int [] ans = new int [2];
        
        int expSum = 0;
        int actuSum = 0 ;


        for (int i = 0 ; i < grid.length  ; i++){
            for(int j = 0 ; j < grid.length ; j++){

                actuSum = actuSum + grid[i][j];

                    for (int k = i ; k < n ; k++){
                        for(int x = 0 ; x  < n ; x++ ){
                            if(i == k && x <= j ){
                                continue ;
                            }if(grid[i][j] == grid[k][x]){
                                a = grid[i][j];
                            }
                        }
                }

                
            }

            expSum = ((n*n) * (n*n + 1)) / 2 ;

            b = (expSum + a) - actuSum ;
            
        }
        ans[0] = a ;
        ans[1] = b ;

        return ans ;
        
    }
}