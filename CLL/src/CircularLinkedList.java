import java.util.Scanner;

public class CircularLinkedList {

	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void insertAtEnd(int data) {
		Node nn = new Node(data); 
		if(head == null) {   
           head = nn;  
           tail = nn;  
           nn.next = head;  
       }  
       else {   
           tail.next = nn;  
           tail = nn;    
           tail.next = head;  
       }  
	}
	
	
	public void insertAtBeginning(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			tail=nn;
			nn.next=head;
		}
		else {
			Node temp=head;
			nn.next=temp;
			head=nn;
			tail.next=head;
		}
	}
	
	
	public void insertAtSpecPos(int data,int pos) {
		Node nn=new Node(data);
		
		if(head==null) { 
			if(pos!=0) {
				System.out.println("Cannot Insert");
				return;
			}
			else {
				head=nn;
				tail.next=head;
			}
		}
		
		if(head!=null && pos==0) {
			nn.next=head;
			head=nn;
			tail.next=head;
			return;
		}
		
		Node cnode=head;
		Node pnode=null;
		int i=0;
		
		while(i<pos) {
			pnode=cnode;
			cnode=cnode.next;
			if(cnode==head) {
				break;
			}
			i++;
		}
		if(cnode==head){
		    nn.next=head;
		    pnode.next=nn;
		    tail=nn;
		}
		else{
    		nn.next=cnode;
    		pnode.next=nn;
		}
	}
	
	
	void deleteAtSpecPos(int pos) {
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
			 tail.next=head;
			 return;
		 }
		 
		 for(int i=0; i<pos-1; i++){
			 temp=temp.next;
		 }
		 
		 if(temp.next.next==head){
				temp.next=head;
		}
		else{
			Node newNode = temp.next.next;
			 temp.next=newNode;
		}
		 	 
	}
	
	
	
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		else
		{
			if(head!=tail) {
				head=head.next;
				tail.next=head;
			}
			else {
				head=tail=null;
			}
		}
	}
	
	
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("Cannot Delete");
			return;
		}
		else {
			if(head!=tail) {
				Node temp=head;
				do {
					temp=temp.next;
				}while(temp.next!=tail);
				tail=temp;
				tail.next=head;
			}
			else {
				head=tail=null;
			}
		}
	}
	
	
	public void search(int data) {
		Node temp=head;
		int i=1;
		boolean flag=false;
		if(head==null) {
			System.out.println("Nothing to Display");
			return;
		}
		else {
			do {
				if(temp.data==data) {
					flag=true;
					break;
				}
				i++;
				temp=temp.next;
			}while(temp!=head);
		}
		if(flag==true) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
	
	
	Node reverseLinkedList(Node head) {
		Node pnode=null;
		Node cnode=head;
		Node nnode=null;
		do {
			nnode=cnode.next;
			cnode.next=pnode;
			pnode=cnode;
			cnode=nnode;
		}while(cnode!=head);
		head.next=pnode;
		head=pnode;
		return head;
	}
	
	
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("Nothing to Display");
			return;
		}
		
		do {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}while(temp!=head);
		System.out.println();
	}
	
	
public static void main(String[] args) {
		
		CircularLinkedList obj=new CircularLinkedList();
		
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

	}


}
