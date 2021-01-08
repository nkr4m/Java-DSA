package LinkedList;
import java.util.*;


public class deleteNode {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int lengthLL() {
		Node current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void del(int position) {
		// If linked list is empty 
        if (head == null) 
            return; 
  
        // Store head node 
        Node temp = head; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        } 
        
        // Find previous node of the node to be deleted 
        for (int i=0; i<position-1; i++) 
            temp = temp.next;
        
        System.out.println(temp.next.data);
  
        // If position is more than number of nodes 
        if (temp == null || temp.next == null) 
            return; 
  
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = temp.next.next; 
  
        temp.next = next;  // Unlink the deleted node from list
		
	}
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		deleteNode slist = new deleteNode();
		
		System.out.println("enter the elements of the linked list");
		int userinput = 0;
		while(userinput != -1) {
			userinput = sc.nextInt();
			if(userinput == -1) {
				break;
			}else {
				slist.addNode(userinput);
			}
		}
		
		
		slist.del(4);
		slist.display();
		
		
		

	}

}
