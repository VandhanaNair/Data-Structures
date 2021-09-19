import java.util.Scanner;

public class DoublyLinkedList {

	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	
	Node head, tail=null;
	
	//Insert at End
	public void insertAtEnd(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			tail=nn;
			
			head.prev=null;
			tail.next=null;
		}
		else {
			tail.next=nn;
			nn.prev=tail;
			tail=nn;
			tail.next=null;
		}
	}
	
	//insert at beginning
	public void insertAtBeginning(int data) {
		Node nn=new Node(data);
		
		if(head==null) {
			head=nn;
			tail=nn;
			
			head.prev=null;
			tail.next=null;
		}
		else {
			head.prev=nn;
			nn.next=head;
			nn.prev=null;
			head=nn;
		}
	}
	
	//Insert at specific position
	public void insertAtSpecPos(int data, int pos) {
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
		    nn.prev=pnode;
		    pnode.next=nn;
		    tail=nn;
		}
		else{
    		nn.next=cnode;
    		cnode.prev=nn;
    		nn.prev=pnode;
    		pnode.next=nn;
		}
	}
	
	//delete at specific position
	public void deleteAtSpecPos(int pos) {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		if(head==tail){
			head=tail=null;
			return;
		}
		Node temp=head;
		if(pos==0) {
			head=temp.next;
			
			head.prev=null;
			
			return;
		}
		for(int i=0;temp!=null && i<pos-1; i++){
			temp=temp.next;
		}
		if(temp==null || temp.next==null) {
			System.out.println("Cannot Delete");
			return;
		}
		
		if(temp.next.next==null){
			temp.next.prev=null;
			temp.next=null;
		}
		else{
			Node newNode=temp.next.next;
			temp.next=newNode;
			newNode.prev=temp;
		}
	}
	
	//delete at beginning
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		else {
			if(head!=tail) {
				head=head.next;
				head.prev=null;
			}
			else {
				head=tail=null;
			}
		}
	}
	
	//delete at end
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
				
				temp.next=null;
				tail.prev=null;
				tail=temp;
			}
			else {
				head=null;
				tail=null;
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
			System.out.println("Not found");
		}
	}
	
	
	//reverse
	public void reverse() {
		Node cnode=head;
		Node pnode=null;
		
		while(cnode!=null) {
			pnode=cnode.prev;
			cnode.prev=cnode.next;
			cnode.next=pnode;
			cnode=cnode.prev;
		}
		if(pnode!=null) {
			head=pnode.prev;
		}
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
		DoublyLinkedList obj=new DoublyLinkedList();
		
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
			
			case 8: obj.reverse();
					break;
			
			case 9: obj.display();
					break;
					
			case 10: System.out.println("Thank You!");
					 flagnew=true;
					 break;
			}
		}

	}

}
