import java.util.*;
public class MyFile
{
    static class Node
    {
        int data;
        Node next = null;
    }

    static void createll(Node head , int len)
    {
        Scanner sc = new Scanner(System.in);
        
        Node curr = head;

        for(int i=1; i<len; i++)
        {
            Node newNode = new Node();
            System.out.println("Enter a number : ");
            newNode.data = sc.nextInt();

            curr.next = newNode;
            curr = newNode;
        }
        sc.close();
    }

    static void printll(Node head)
    {
        System.out.println("Linked List is : ");
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + "->");

            curr = curr.next;
        }
        System.out.println("null");
    }

    static int countNodes(Node head)
    {
        Node curr = head;
        int count = 0;

        while(curr != null)
        {
            count++;
            curr = curr.next;
        }

        return count;
    }
    public static void main(String[] args) 
    {
        //this is to demonstrate the dynamic creation of linkedlist for a given length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Linked List : ");
        int len = sc.nextInt();

        Node head = new Node();
        System.out.println("Enter a number : ");
        head.data = sc.nextInt();

        createll(head , len);
        printll(head);
        int size = countNodes(head);
        System.out.println("Number of Nodes are : " + size);
        sc.close();
    }
}