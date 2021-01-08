package LinkedList;
import java.util.*;

public class lengthLL {
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
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	
	public void display() {
		Node current = head;
		int count = 0;
		while(current != null) {
			count = count + 1;
			current = current.next;
		}
		System.out.println(count);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		lengthLL slist = new lengthLL();
		
		System.out.println("enter the elements of the LL");
		int userinput = 0;
		while(userinput != -1) {
			userinput = sc.nextInt();
			if(userinput == -1) {
				break;
			}
			else {
				slist.addNode(userinput);
			}
		}
		
		slist.display();

	}

}
