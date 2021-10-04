import java.util.*;
public class PriorityQueue {
	static class Node{
		int data;
		int priority;
		Node next;
	}
	
	public boolean isEmpty(Node head) {
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	Node enqueue(Node head, int data, int priority) {
		if(head==null) {
			Node nn=new Node();
			nn.data=data;
			nn.priority=priority;
			nn.next=null;
			head=nn;
			System.out.println("First node inserted");
		}
		else {
			Node temp=head;
			
			Node nn=new Node();
			nn.data=data;
			nn.priority=priority;
			nn.next=null;
			
			if(head.priority > priority) {
				nn.next=head;
				head=nn;
			}	
			else {
				while(temp.next!=null && temp.next.priority < priority) {
					temp=temp.next;
				}
				nn.next=temp.next;
				temp.next=nn;
			}
			System.out.println("Data inserted");
		}
		return head;
	}
	
	Node dequeue(Node head) {
		if(head==null) {
			System.out.println("Queue is Empty!");
			return head;
		}
		Node temp=head;
		head=head.next;
		System.out.println("Data deleted: "+temp.data);
		return head;
	}
	
	public void display(Node head) {
		if(isEmpty(head)) {
			System.out.println("Queue is Empty!");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" <- ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue obj=new PriorityQueue();
		Scanner sc=new Scanner(System.in);
		
		boolean flagnew=false;
		Node head=new Node();
		head=null;
		
		while(flagnew==false) {
			System.out.println("**************");
			System.out.println("1.Enqueue\n2.Dequeue\n3.isEmpty\n"
					+ "4.Display\n5.Exit");
			System.out.println("Select an option: ");
			System.out.println("**************");
			int n=sc.nextInt();
			switch(n) {
			case 1: System.out.println("Enter data and priority: ");
					int enqueueValue=sc.nextInt();
					int p=sc.nextInt();
					head=obj.enqueue(head,enqueueValue,p);
					break;
			
			case 2: head=obj.dequeue(head);
					break;
			
			case 3: if(obj.isEmpty(head)) {
				System.out.println("Queue is Empty!");
			}
			else {
				System.out.println("Queue is not Empty!");
			}
					break;
			
			case 4: obj.display(head);
					break;
			
			case 5: System.out.println("Thank You!");
					 flagnew=true;
					 break;
			}
		}
	}
}







//data: 56 34 11 23 98
//prio: 0  1  2  3  4
//
//11 98 56 34 23


