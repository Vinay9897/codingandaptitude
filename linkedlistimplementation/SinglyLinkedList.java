package linkedlistimplementation;

import javax.sound.midi.Synthesizer;

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
        if(index>size)return;
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
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.addFirst(14);
        sll.addLast(16);
        sll.addLast(16);
        sll.addAtIndex(3, 15);
        sll.deleteAtIndex(2);
        // sll.addLast();
        sll.traverse();
    }
}