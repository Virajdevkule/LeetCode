class Solution {
    public int search(int[] A, int t) {

        int start = 0 ;
        int end = A.length - 1 ; 

        while (start <= end ){
            int mid = start + (end - start )/2;

            if (A[mid] == t ){
                return mid ;
            }
            
            if (A[start] <= A[mid]){
                if (A[start] <= t && t <= A[mid]){
                    end = mid - 1 ;
                }else{
                    start = mid + 1 ;
                }
            }else{
                if(A[mid] <= t && t <= A[end] ){
                    start = mid + 1 ;
                }else{
                    end = mid - 1;
                }
            }

        }

        return -1 ;
        
    }
}