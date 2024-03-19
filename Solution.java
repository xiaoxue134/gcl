public class Solution{
    public static  void combloop1(int n, int r){
        /**********  Begin  **********/

        if (n<r) return ;
        for (int i = 1; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                for (int k = j+1; k<=n; k++){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        /**********  End  **********/
    }
    // public static void main(String[] args){
    //     int n, r;
    //    combloop1(n,r);
    
    // }
    }

// public static void main(String[] args){
//     System.out.println(combloop1(5,3));



