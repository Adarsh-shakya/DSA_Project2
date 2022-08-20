import java.util.Scanner;

class Node
{
    int data;
    Node next;
}
public class Linkedlist
{
    Node head;
    int len;
    public void insert(int data)
    {
        Node nn=new Node();
        nn.data=data;
        len++;
        if(head==null)
        {
            head=nn;
        }
        else
        {
            Node current=head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
    }
    public void traverse()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("List is Empty.");
        }
        else{
            while (current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println(len);
        }
    }
    public int getMid()
    {
        Node current=head;
        int i=1;
        while(i<(len/2)+1)
        {
            i++;
            current=current.next;
        }
        return current.data;
    }
    public static void main(String []args)
    {
        Linkedlist obj=new Linkedlist();
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        System.out.println(obj.getMid());
        obj.traverse();
    }
}