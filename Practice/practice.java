// import java.util.*;
// class Node{
//     int val;
//     Node next;
//     Node(int val){
//         this.val=val;
//     }

// }
// class LinkedList{
//     Node head;
//     int size;
//     LinkedList(){
//         this.head=null;
//         this.size=0;
//     }
//     void insertAtTail(int val){
//         Node newNode=new Node(val);
//         if(size==0){
//             head=newNode;
//             size++;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null) temp=temp.next;
//         temp.next=newNode;
//         size++;
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     void update(int val,int newVal){
//         Node temp=head;
//         while(temp.val!=val) temp=temp.next;
//         temp.val=newVal;
//     }
//     int size(){
//         return size;
//     }
//     int lastOccurrence(int val){
//         Node temp=head;
//         int i=0;
//         int idx=-1;
//         while(temp!=null){
//             if(temp.val==val) idx=i;
//             i++;
//             temp=temp.next;
//         }
//         return idx;
//     }
//     void reverse(){
//         Node prev=null;
//         Node curr=head;
//         Node Next=head;
//         while(curr!=null){
//             Next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=Next;
//         }
//         head=prev;
//     }
// }
// public class practice {

//     public static void main(String[] args) {
//         LinkedList list=new LinkedList();
//         list.insertAtTail(9);
//         list.insertAtTail(10);
//         list.insertAtTail(12);
//         list.insertAtTail(3);
//         list.insertAtTail(5);
//         list.insertAtTail(9);
//         list.insertAtTail(8);
//         list.insertAtTail(4);
//         list.insertAtTail(5);
//         list.insertAtTail(1);
//         list.display();
//         list.update(5,15);
//         list.display();
//         System.out.println(list.size());
//         System.out.println(list.lastOccurrence(9));
//         list.reverse();
//         list.display();

        
//     }
// }

import java.util.ArrayList;
import java.util.Stack;
public class practice {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        int n=arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int val=arr[i];
            while(!st.isEmpty() && arr[st.peek()]<=val) st.pop();
            if(st.isEmpty()) ans.add(i+1);
            else ans.add(i-st.peek());
            st.push(i);

        }
        for(int ele: ans) System.out.print(ele+" ");
    }
}