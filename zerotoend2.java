public class zerotoend2 {
    public static void ans(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0){
                int k=i+1; 
                while(arr[k]==0 && k<arr.length-1){
                    k++; 
                }
                if(arr[k]!=0)
                {
                    arr[i]=arr[k];
                    arr[k]=0; 
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 4, 5, 0, 7, 8, 9, 10};
        ans(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // Output: 1 2 4 5 7 8 9 10 0 0
    }
}
