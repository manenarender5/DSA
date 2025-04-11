public class SinglyLinkedList {
    public static void main(String [] args)
    {
        Node node=new Node(1);
        node.next=new Node(3);
        node.next.next=new Node(8);
        node.next.next.next=new Node(9);
        node.next.next.next.next=new Node(11);
        node.display(node);
        System.out.println("Reverese");
        Node lrs=node.reverse(node);
        node.display(lrs);

    }

}
class Node
{
    int data;
    Node next;
    public Node(int data ,Node next)
    {
        this.data=data;
        this.next=next;
    }
    public Node(int data)
    {
        this.data=data;
    }
    public void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node reverse(Node head)
    {
        Node previous=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
