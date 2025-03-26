//importing all the packages 
import java.util.*;
import java.util.Scanner;

//define class
class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }


//create node
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }


// to add elements
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


// to add at last of node
    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;

    }


//to display list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


//search with key and print index
    public void search(int key) {
        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if (currNode.data == key) {
                System.out.println(i);
                return;
            }
            currNode = currNode.next;
        }
        System.out.println("not found");

    }

//to delete 1st node
    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty nothing to delete!");
            return;
        }
        Node currNode = head;
        head = currNode.next;
        size--;
    }

//to delete last element
    public void removeLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

//size of the list
    public int getSize() {
        return size;
    }


//reversing list
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


//main function
    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addlast(5);
        list.printList();
        list.reverseList();
        list.printList();
    }

}
