import java.util.*;
public class StackProgram {

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	Node top=null;
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void push(int data) {
		Node nn=new Node(data);
		if(isEmpty()) {
			top=nn;
			System.out.println("First Node inserted.");
		}
		else {
			Node temp=top;
			top=nn;
			nn.next=temp;
		}
		System.out.println("Data inserted.");
	}
	
	public int pop() {
		int val=0;
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
		}
		else {
			val=top.data;
			top=top.next;
			System.out.println("Data deleted. "+val);
		}
		return val;
	}
	
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
		}
		else {
			System.out.println("Peek element is: "+top.data);
		}
	}
	
	
	public void display() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty!");
		}
		else {

			Node temp = top;
	        while (temp != null) {
	            System.out.print(temp.data+" -> ");
	            temp = temp.next;
	        }
	        System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		StackProgram obj=new StackProgram();
		
		Scanner sc=new Scanner(System.in);
		
		boolean flagnew=false;
		
		while(flagnew==false) {
			System.out.println("****************************************");
			System.out.println("1.Push\n2.Pop\n3.isEmpty\n"
					+ "4.Peek\n5.Display\n6.Exit");
			System.out.println("Select an option: ");
			System.out.println("****************************************");
			int n=sc.nextInt();
			switch(n) {
			case 1: System.out.println("Enter data: ");
					int pushValue=sc.nextInt();
					obj.push(pushValue);
					break;
			
			case 2: obj.pop();
					break;
			
			case 3: if(obj.isEmpty()) {
				System.out.println("Stack is Empty!");
			}
			else {
				System.out.println("Stack is not Empty!");
			}
					break;
			
			case 4: obj.peek();
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
