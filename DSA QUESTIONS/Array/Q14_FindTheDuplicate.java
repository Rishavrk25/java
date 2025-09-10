package Array;
public class Q14_FindTheDuplicate {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        int slow=arr[0];
        int fast=arr[0];
        while(true){
            slow=arr[slow];
            fast=arr[arr[fast]];
            if(slow==fast) break;
        }
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        
        return slow; 
    }
}
