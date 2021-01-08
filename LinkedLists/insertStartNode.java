package LinkedList;
import java.util.*;

public class insertStartNode {
	
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
	
	public void addNode_atStart(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
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
		
		insertStartNode slist = new insertStartNode();
		
		System.out.println("enter the elements of the array");
		int userinput = 0;
		while(userinput != -1) {
			userinput = sc.nextInt();
			if (userinput == -1) {
				break;
			}
			else {
				slist.addNode_atStart(userinput);
			}
		}
		
		slist.display();

	}

}
