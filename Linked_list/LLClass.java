class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head==null) head=tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    void insertAtHead(int val){
        Node newNode = new Node(val);
        if(head==null) head=tail=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
        size++; 
    }
    void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return; 
        }
        if(idx>size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        } 
        Node newNode=new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;


    }
    int get(int idx){
        if(idx==0) return head.val;
         if(idx>=size || idx<0){
            System.out.println("Invalid index");
            return -1;
        }
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        
    }
    void size(){
        System.out.println(size);
    }
    
    void deleteAtHead(){
        if(head==null) System.out.println("list is empty.");
        head=head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if(idx==0) deleteAtHead();
        if(head==null) throw new Error("List is empty");
        if(idx>=size || idx<0) throw new Error("Invalid index");
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
}
public class LLClass {
    
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        // list.insertAtHead(100);
        // list.insert(6,200);
        // list.deleteAtHead();
        list.delete(4);
        list.display();
        // list.size();
        // System.out.println(list.get(3));


    }
}
