import java.util.*;
import java.lang.*;
import java.io.*;

class Linkedlist {
    
    // class to create node
    static class Node{
        int data;
        Node next;
        
        Node (int val){
            data = val;
            next = null;
        }
    }
    
    // head of Linkedlist
    Node head;
    
    // insert element to the list
    public static Linkedlist insert(Linkedlist list, int data){
        Node newrec = new Node(data);
        newrec.next = null;
        // if head is null
        if(list.head == null){
            list.head = newrec;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = newrec;
        }
        return list;
    }
    
    // display Linkedlist
    public static void display(Linkedlist list){
        if(list.head == null){
            System.out.println("Linkedlist is empty");
        }
        else{
            Node temp = list.head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
         System.out.println();
    }

    // insert element at middle position of Linkedlist
    public static Linkedlist insertmiddle(Linkedlist list, int data){
        Node newrec = new Node(data);
        if(list.head == null){
            list.head = newrec;
        }
        else{
            int l = 0;
            Node temp = list.head;
            while(temp!=null){
                l++;
                temp = temp.next;
            }
            int p = (l%2==0)?(l/2):(l/2)+1;
            Node k = list.head;
            while(--p > 0){
                k = k.next;
            }
            newrec.next = k.next;
            k.next = newrec;
        }
        return list;
    }
    
    public static Linkedlist insertatpos(Linkedlist list, int data, int position){
        Node newrec = new Node(data);
        if(list.head == null){
            list.head = newrec;
        }else{
            int l = 0;
            Node k = list.head;
            while(k!=null){
                l++;
                k = k.next;
            }
            if(position<=l){
                Node temp = list.head;
                while(--position > 1){
                    temp = temp.next;
                }
                newrec.next = temp.next;
                temp.next = newrec;
            }else{
                System.out.println("Position is out of bound!");
            }
        }
        return list;
    }
    
    public static Linkedlist deleteend(Linkedlist list){
        Node temp = list.head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return list;
    }
    
    public static Linkedlist deletepos(Linkedlist list, int position){
        Node temp = list.head;
        while(--position > 1){
            temp = temp.next;
        }
        Node k = temp.next;
        temp.next = k.next;
        return list;
        
    }
    
    public static void main(String args[]){
        Linkedlist list = new Linkedlist();
        
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insertmiddle(list, 3);
        list = insertmiddle(list, 8);
        list = insertatpos(list, 10, 3);
        list = insertatpos(list, 14, 5);
        list = insertmiddle(list, 50);
        list = deleteend(list);
        display(list);
        list = deletepos(list, 3);
        display(list);
        list = deletepos(list, 5);
        display(list);
        
        
    }
}
