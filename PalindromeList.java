import java.util.*;
class PalindromeList{
Node head;
LinkedList(){

}
public class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
  //add element at first
public void add(){
Node newNode= new Node(data);
if(head==null){
head=newNode;
return;
}
newNode.next=head;
head=newNode;
}
public Node middle(Node head){
Node fast=head;
Node slow=head;
while(fast.next!=null && fast.next.next!=null){
fast=fast.next.next;
slow=slow.next;
}
return slow;
}
public Node reverse(Node head){
  if(head==null||head.next==null){
    return head;
  }
Node prev=null;
Node curr=head;
while(curr!=null){
Node nextNode = curr.next;
curr.next=prev;
prev=curr;
curr=nextNode;
}
  return prev;
}
public  boolean isPalindrome(){
Node firstHalfEnd=middle(head);
Node secondHalfStart=reverse(firstHalfEnd.next);
Node firstHalfStart=head;
while(secondHalfStart!=null){
if(firstHalfStart.data!=secondHalfStart.data){
return false;
}
firstHalfStart=firstHalf.next;
secondHalfStart=secondHalf.next;
}
return true;
}
public static void main(String[] args){
PalindromeList list=new LinkedList();
list.add(1);
list.add(2);
list.add(2);
list.add(1);
System.out.println(list.isPalindrome);

}
}
