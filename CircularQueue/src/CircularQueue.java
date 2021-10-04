import java.util.*;
public class CircularQueue {
	class Node{
		int data;
		Node next;
	}
	
	static class Queue{
		Node front,rear;
	}
	
	public boolean isEmpty(Queue qobj) {
		if(qobj.front==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void enqueue(Queue qobj,int data) {
		Node nn=new Node();
		nn.data=data;
		if(qobj.front==null) {
			qobj.front=nn;
		}
		else {
			qobj.rear.next=nn;
		}
		
		qobj.rear = nn;
		qobj.rear.next = qobj.front;
		System.out.println("Data inserted");
	}
	
	void dequeue(Queue qobj)
	{
		if (qobj.front == null) {
			System.out.println("Queue is empty");
			return;
		}

		int data; 
		if (qobj.front == qobj.rear) {
			data = qobj.front.data;
			qobj.front = null;
			qobj.rear = null;
		}
		else
		{
			Node temp = qobj.front;
			data = temp.data;
			qobj.front = qobj.front.next;
			qobj.rear.next = qobj.front;
		}
		System.out.println("Deleted Value is: "+data);
	}

	 void display(Queue qobj)
	{
		 if(isEmpty(qobj)) {
			 System.out.println("Queue is Empty");
		 }
		 else
		 {
		Node temp = qobj.front;
		while (temp.next != qobj.front) {
			System.out.printf("%d <-", temp.data);
			temp = temp.next;
		}
		System.out.printf("%d", temp.data);
		System.out.println();
		 }
	}
	 
	 public static void main(String args[])
		{
			
			Queue qobj = new Queue();
			qobj.front = qobj.rear = null;

			Scanner sc=new Scanner(System.in);
			CircularQueue obj=new CircularQueue();
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
						obj.enqueue(qobj,enqueueValue);
						break;
				
				case 2: obj.dequeue(qobj);
						break;
				
				case 3: if(obj.isEmpty(qobj)) {
					System.out.println("Queue is Empty!");
				}
				else {
					System.out.println("Queue is not Empty!");
				}
						break;
				
				case 4: if(obj.isEmpty(qobj))
				{
					System.out.println("Queue is Empty!");
				}
				else
				{
					System.out.println("Queue Front : " + qobj.front.data);
					System.out.println("Queue Rear : " + qobj.rear.data);
				}
						break;
				
				case 5: obj.display(qobj);
						break;
				
				case 6: System.out.println("Thank You!");
						 flagnew=true;
						 break;
				}
			}
		}
	}
