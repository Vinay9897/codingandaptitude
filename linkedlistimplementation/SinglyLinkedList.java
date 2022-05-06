 package linkedlistimplementation;

class Node {
    //field
    int val;
    Node next;

    //properties
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head = new Node(0);
    int size= 0;
    
    private void addFirst(int val) {
        Node temp = head.next;
        head.next = new Node(val);
        head.next.next = temp;
        size++;
    }
    private void deleteFirst(){
        if(size<0)return;
        Node temp = head.next;
        head.next = temp.next;
        size--;
    }
    private void traverse() {
        Node temp = head.next;
        while(temp!= null){
            System.out.print(temp.val +"-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    private void addLast(int val){
        Node temp = head;
        for(int index = 0;index<size;index++)
        {
            temp = temp.next;
        }
        temp.next = new Node(val);
        size++;
    }
    private void addAtIndex(int index, int val)
    {
        if(index>size)
        {System.out.println("Adding at index "  +index + " not possible");
        return;}
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = new Node(val);
        temp.next.next = temp1;
        size++;
    }
    private void deleteAtIndex(int index)
    {
        if(index>=size)return;
        Node temp = head;
        for(int i = 0;i<index;i++)
        {
            temp = temp.next;
        }
        Node delete = temp.next;
        temp.next = delete.next;
        delete.next = null;
        size--;
    }
    private int get(int index)
    {
        if(index>=size || index<0)return -1;
        Node temp = head.next;// because head contain dummy node 0 at first
        if(temp == null)return -1;
        for(int i= 0; i<index;i++)
        {
            temp = temp.next;
        }
        return temp.val;
    }
    Node temp = head;
    private Node swapNode(Node head)
    {
        if(head == null) return null;
        if(head !=null && head.next != null)
        {
            int node = head.val;
            head.val = head.next.val;
            head.next.val = node;
        }
        swapNode(head.next);
        return temp;
    }
    

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.addFirst(14);
        sll.addLast(16);
        sll.addAtIndex(3, 15);
        sll.deleteAtIndex(2);
        sll.addFirst(7);
        sll.addFirst(4);
        sll.deleteFirst();
        sll.traverse();
        System.out.print(" " +sll.get(1));
        sll.swapNode(new Node(7));
        sll.traverse();
    }
}

 // Node dummy;
    // private void reverse(){
    //      dummy = null;
    //     Node temp = head.next;
    //     Node nex = temp.next;
    //     while(nex != null)
    //     {
    //         temp.next = dummy;
    //         dummy = temp;
    //         temp = nex;
    //         nex = nex.next;
    //     }
    //     dummy = temp;
    // }
    // private void reverseTrav(){
    //     while(dummy!= null)
    //     {
    //         System.out.print(dummy.val + "-->");
    //         dummy = dummy.next;
    //     }
    //     System.out.print("null");
    // }
     //  sll.reverse();
        // sll.reverseTrav();