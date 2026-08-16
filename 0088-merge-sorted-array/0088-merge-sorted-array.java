class Solution {
    public void merge(int[] A, int m, int[] B, int n) {

        int ind = m+n- 1;
        int i = m - 1 ;
        int j = n - 1 ;

        while (i >= 0 && j >= 0){
            if(A[i] >= B[j]){
                A[ind--] = A[i--];
            }else{
                A[ind--] = B[j--] ; 
            }
        }
        while(j >= 0){
            A[ind--] = B[j--];
        }        
    }
}