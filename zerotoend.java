public class zerotoend {
    public static void ans(int[] arr){
        int j=arr.length -1; 
        for(int i=0;i<j; i++){
            while(arr[j]==0 && j>=0){
                j--; 
            }
            if(arr[i]==0){
                arr[i]= arr[j];
                arr[j]=0; 
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
