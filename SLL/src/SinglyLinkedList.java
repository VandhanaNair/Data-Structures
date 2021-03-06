import java.util.*;
public class SinglyLinkedList {

	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	//Insert at end
	public void insertAtEnd(int data) {
		Node nn = new Node(data);
		
		if(head==null) {
			head=nn;
			tail=nn;
		}
		else {
			tail.next=nn;
			tail=nn;
		}
	}
	
	//Insert at beginning
	public void insertAtBeginning(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			tail=nn;
		}
		else {
			Node temp=head;
			head=nn;
			head.next=temp;
		}
	}
	
	
	//Insert at specific position
	public void insertAtSpecPos(int data,int pos) {
		Node nn=new Node(data);
		
		if(head==null) { 
			if(pos!=0) {
				System.out.println("Cannot Insert");
				return;
			}
			else {
				head=nn;
			}
		}
		
		if(head!=null && pos==0) {
			nn.next=head;
			head=nn;
			return;
		}
		
		Node cnode=head;
		Node pnode=null;
		int i=0;
		
		while(i<pos) {
			pnode=cnode;
			cnode=cnode.next;
			if(cnode==null) {
				break;
			}
			i++;
		}
		if(cnode==null){
		    nn.next=null;
		    pnode.next=nn;
		    tail=nn;
		}
		else{
    		nn.next=cnode;
    		pnode.next=nn;
		}
	}
	
	
	//Delete at specific position
	void deleteAtSpecPos(int pos) {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		
		 Node temp=head;
		 if(pos==0) {
			 head=temp.next;
			 return;
		 }
		 
		 for(int i=0; temp!=null && i<pos-1; i++){
			 temp=temp.next;
		 }
		 
		 if(temp==null || temp.next==null) {
			 System.out.println("Cannot Delete");
			 return;
		 }
		 
		 Node newNode = temp.next.next;
		 temp.next=newNode;
	}
	
	
	//Delete at beginning
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		else
		{
			if(head!=tail) {
				head=head.next;
			}
			else {
				head=tail=null;
			}
		}
	}
	
	
	//Delete at end
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		else {
			if(head!=tail) {
				Node temp=head;
				while(temp.next!=tail) {
					temp=temp.next;
				}
				tail=temp;
				tail.next=null;
			}
			else {
				head=tail=null;
			}
		}
	}
	
	//search 
	public void search(int data) {
		Node temp=head;
		int i=1;
		boolean flag=false;
		if(head==null) {
			System.out.println("Nothing to Display");
			return;
		}
		else {
			while(temp!=null) {
				if(temp.data==data) {
					flag=true;
					break;
				}
				i++;
				temp=temp.next;
			}
		}
		if(flag==true) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
	
	//reverse linked list
	Node reverseLinkedList(Node head) {
		Node pnode=null;
		Node cnode=head;
		Node nnode=null;
		while(cnode!=null) {
			nnode=cnode.next;
			cnode.next=pnode;
			pnode=cnode;
			cnode=nnode;
		}
		head=pnode;
		return head;
	}
	
	//display
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("Nothing to Display");
			return;
		}
		
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println();
	}

	//main	
	public static void main(String[] args) {
		
		SinglyLinkedList obj=new SinglyLinkedList();
		
		Scanner sc=new Scanner(System.in);
		
		boolean flagnew=false;
		
		while(flagnew==false) {
			System.out.println("****************************************");
			System.out.println("1.InsertAtBeginning\n2.InsertAtSpecPos\n3.InsertAtEnd\n"
					+ "4.DeleteAtBeginning\n5.DeleteAtSpecPos\n6.DeleteAtEnd\n"
					+ "7.Search\n8.Reverse\n9.Display\n10.Exit");
			System.out.println("Select an option: ");
			System.out.println("****************************************");
			int n=sc.nextInt();
			switch(n) {
			case 1: System.out.println("Enter data: ");
					int valAtBeginning=sc.nextInt();
					obj.insertAtBeginning(valAtBeginning);
					break;
			
			case 2: System.out.println("Enter data and position: ");
					int valAtSpecPos=sc.nextInt();
					int pos=sc.nextInt();
					obj.insertAtSpecPos(valAtSpecPos,pos);
					break;
			
			case 3: System.out.println("Enter data: ");
					int valAtEnd=sc.nextInt();
					obj.insertAtEnd(valAtEnd);
					break;
			
			case 4: obj.deleteAtBeginning();
					System.out.println("Data Deleted");
					break;
			
			case 5: System.out.println("Enter position: ");
					int position=sc.nextInt();
					obj.deleteAtSpecPos(position);
					System.out.println("Data Deleted");
					break;
			
			case 6: obj.deleteAtEnd();
					System.out.println("Data Deleted");
					break;
			
			case 7: System.out.println("Enter data to search: ");
					int searchVal=sc.nextInt();
					obj.search(searchVal);
					break;
			
			case 8: obj.head=obj.reverseLinkedList(obj.head);
					break;
			
			case 9: obj.display();
					break;
					
			case 10: System.out.println("Thank You!");
					 flagnew=true;
					 break;
			}
		}
		
//		obj.insertAtEnd(1);
//		obj.insertAtEnd(2);
//		obj.insertAtEnd(3);
//		obj.insertAtEnd(4);
//		obj.display();
//		obj.insertAtBeginning(11);
//		obj.display();
//		obj.insertAtSpecPos(22,4);
//		obj.display();
//		obj.deleteAtBeginning();
//		obj.display();
//		obj.deleteAtEnd();
//		obj.display();
//		obj.deleteAtSpecPos(2);
//		obj.display();
//		obj.search(22);
//		obj.head=obj.reverseLinkedList(obj.head);
//		obj.display();

	}

}
