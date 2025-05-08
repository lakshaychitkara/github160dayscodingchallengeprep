import java.util.*; 
public class pq {
    public static int getSecondLargest(int[] arr){
        if(arr.length <=1){
            return -1; 
        }
        HashSet<Integer> hs = new HashSet<>(); 
        for(int i: arr){
            hs.add(i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(hs); 
        pq.poll();
        return pq.poll(); 
    }
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getSecondLargest(arr)); // Output: 9
    }
}
