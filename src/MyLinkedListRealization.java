import javax.swing.*;
import java.util.Arrays;

public class MyLinkedListRealization {
    private Node head;
    private int size;
    public void add(Integer element){
        if(head == null){
            this.head = new Node(element);
        } else{
            Node tempNode = head;
            while(tempNode.getNext() != null){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(new Node(element));
        }
        size++;
    }

    @Override
    public String toString() {
        int[] array = new int[size];
        Node tempNode = head;
        int index = 0;
        while (tempNode != null) {
            array[index++] = tempNode.getValue();
            tempNode = tempNode.getNext();
        }
        return Arrays.toString(array);
    }

    public Integer get(int value){
        Node tempNode = head;
        int index = 0;
        while(tempNode != null){
            if(index == value){
                return tempNode.getValue();
            }
            tempNode = tempNode.getNext();
            index++;
        }
        throw new IllegalArgumentException("Index out of bounds");
    }

    public void remove(int value){
        Node tempNode = head;
        if(value == 0){
            head = head.getNext();
            size--;
            return;
        }
        for (int i = 0; i < value - 1; i++) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        size--;
    }
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }
    }
}
