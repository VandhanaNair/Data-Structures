import java.util.*;
public class LinearQueue {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	Node front, rear;
	
	public LinearQueue() {
		this.front=null;
		this.rear=null;
	}
	
	public boolean isEmpty() {
		if(front==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void enqueue(int data) {
		Node nn=new Node(data);
		if(this.rear==null) {
			this.front=this.rear=nn;
			System.out.println("First node inserted");
			return;
		}
		
		this.rear.next=nn;
		this.rear=nn;
		System.out.println("Data inserted");
	}

	void dequeue() {
		if(this.front==null) {
			System.out.println("Queue is Empty!");
			return;
		}
		Node temp=this.front;
		System.out.println("Dequeued Value: "+temp.data);
		this.front=this.front.next;
		
		if(this.front==null) {
			this.rear=null;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		}else {
			Node temp=front;
			while(temp!=null) {
				System.out.print(temp.data+" <- ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
		public static void main(String[] args) {
			
			LinearQueue obj=new LinearQueue();
			Scanner sc=new Scanner(System.in);
			boolean flagnew=false;
			
			while(flagnew==false) {
				System.out.println("**************");
				System.out.println("1.Enqueue\n2.Dequeue\n3.isEmpty\n"
						+ "4.Front and Rear values\n5.Display\n6.Exit");
				System.out.println("Select an option: ");
				System.out.println("**************");
				int n=sc.nextInt();
				switch(n) {
				case 1: System.out.println("Enter data: ");
						int enqueueValue=sc.nextInt();
						obj.enqueue(enqueueValue);
						break;
				
				case 2: obj.dequeue();
						break;
				
				case 3: if(obj.isEmpty()) {
					System.out.println("Queue is Empty!");
				}
				else {
					System.out.println("Queue is not Empty!");
				}
						break;
				
				case 4: if(obj.isEmpty())
				{
					System.out.println("Queue is Empty!");
				}
				else
				{
					System.out.println("Queue Front : " + obj.front.data);
					System.out.println("Queue Rear : " + obj.rear.data);
				}
						break;
				
				case 5: obj.display();
						break;
				
				case 6: System.out.println("Thank You!");
						 flagnew=true;
						 break;
				}
			}

	}

}









