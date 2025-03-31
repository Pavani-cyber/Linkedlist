public class DeleteNt{
  
  //delete nth position
  public Node deleteNth(Node head,int n){
    if(head.next==null){
      return null;
    }
    int size=0;
    Node curr=head;
    while(curr ! = null){
      curr=curr.next;
      size++;
    }
    if(n == size){
      return head.next;
    }
    int indexToSearch=size-n;
    Node prev=head;
    int i=1;
    while(i<indexToSearch){
      prev=prev.next;
      i++;
    }
    prev.next=prev.next.next;
    return head;
  }
  public static void amin(String[] args){
    DeleteNth list=new DeleteNth();
    //add function in previous file
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(2);
    list.add(1);
    //printList function in the LL.java file
    list.printList();
    list.deleteNth(head,4);
    list.printList();
  
  }
}
