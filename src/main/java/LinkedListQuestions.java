public class LinkedListQuestions {
    Node head;
    DoublyNode doublyHead;
    void insertAtFront(int data){
        Node<Integer> newNode = new Node<>();
        newNode.data=data;
        newNode.next=head;
        head=newNode;

    }

    void insertAtDoubly(int data){
        DoublyNode<Integer> newNode = new DoublyNode<>();
        newNode.data=data;
        newNode.next=doublyHead;
        doublyHead.prev=newNode;
        doublyHead=newNode;

    }

    void removeFirstNode(){

       head = head.next;

    }

    void printList(){
        Node node = head;

        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }

    }

    void printMiddle(){
        if(head==null)
            return;
        Node first = head;
        Node second = head;

        while (second!=null && second.next!=null){
            first = first.next;
            second=second.next.next;
        }

        System.out.println("Middle eleament " + first.data);

    }

    void printNFromLast(int n){
        if(head==null)
            return;
        Node fast_ptr = head;
        Node slow_ptr = head;

        int count = 0;
        while(fast_ptr!=null && count<n){
            fast_ptr=fast_ptr.next;

            count++;
        }

        if(fast_ptr==null && count==n){
            System.out.println(" nth elese menet "+head.data);
        }

        while (fast_ptr!=null){

            fast_ptr=fast_ptr.next;
            slow_ptr=slow_ptr.next;
        }

        if(fast_ptr==null && count!=n){
            System.out.println(" element doesn't exist ");
        }

        System.out.println("nth element " + slow_ptr.data);

    }

    void deleteMiddle(){
        if(head==null)
            return;
        Node first = head;
        Node second = head;
        Node prev=null;
        while (second!=null && second.next!=null){
            prev=first;
            first = first.next;
            second=second.next.next;
        }

        if(prev!=null && first!=null && first.next!=null) {
            prev.next = first.next.next;

        }
       // System.out.println("Middle eleament " + first.data);

    }

    void reverseLinkedList(){
       // Node prev = null;
        Node next = null;
        Node curr=null;
        Node node = head;


        while( node!=null){
            next = node.next;
            curr=node;
            next.next=curr;
            node = node.next;
          //  curr.next=prev;
           // prev=next.next;
           // next=next.next;

        }
    }

    public static void main (String [] args){

        LinkedListQuestions list = new LinkedListQuestions();

        list.insertAtFront(6);
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);

        list.printList();
        list.removeFirstNode();
        System.out.println("\n");
        list.printList();
        System.out.println("\n");
        list.printMiddle();

        list.deleteMiddle();
        System.out.println("\n");
        list.printList();
        System.out.println("\n");
        list.printNFromLast(2);


    }


}


class Node<T>{
    T data;
    Node next;
}

class Queue<T>{
    Node<T> head,tail;

    public Queue() { this.head = this.tail = null; }

    void enqueue(T data){
        Node node = new Node();
        node.data=data;
        if(tail == null){
            tail=head=node;
        }else{
            tail.next=node;
            tail = node;
        }

    }

    T dequeue(){
        if(head==null)
            return null;
        T data = head.data;
        head = head.next;
        if(head==null)
            tail=null;
        return data;
    }
}


class Stack<T>{
    Node<T> head;

    public Stack() { this.head = null; }

    void push(T data){
        Node node = new Node();
        node.data=data;
        if(head == null){
            head=node;
        }else{
            head.next=node;
            head = node;
        }

    }

    T pop(){
        if(head==null)
            return null;
        T data = head.data;
        head = head.next;
        return data;
    }

    T top(){
        if(head==null)
            return null;
       return head.data;
    }
}


class DoublyNode<T>{
    T data;
    DoublyNode next;
    DoublyNode<T> prev;
}