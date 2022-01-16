import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class MaxHeap{
	List<Integer> heap = new ArrayList<>();
	
	public MaxHeap() {}
	
	public MaxHeap(List<Integer> arr) {
		buildHeap(arr);
	}
	
	private int parent(int i) {
		return (i-1)/2;
	}
	
	private int left(int i) {
		return (2*i)+1;
	}
	
	private int right(int i) {
		return (2*i)+2;
	}
	
	private void buildHeap(List<Integer> arr) {
		heap=arr;
		for(int i=parent(heap.size()-1); i>=0; i--) {
			shiftDown(i);
		}
	}
	
	private void shiftDown(int currentIndex) {
		int lastIndex=heap.size()-1;
		int leftIndex=left(currentIndex);
		
		while(leftIndex<=lastIndex) {
			int rightIndex=right(currentIndex);
			int shiftingIndex;
			
			if(rightIndex<=lastIndex && heap.get(rightIndex)>heap.get(leftIndex)) {
				shiftingIndex=rightIndex;
			}
			else {
				shiftingIndex=leftIndex;
			}
			
			if(heap.get(currentIndex)<heap.get(shiftingIndex)) {
				Collections.swap(heap, currentIndex, shiftingIndex);
				currentIndex=shiftingIndex;
				leftIndex=left(currentIndex);
			}
			else {
				return;
			}
		}
	}
	
	private void shiftUp(int currentIndex) {
		int parentIndex=parent(currentIndex);
		while(currentIndex>0 && heap.get(parentIndex)<heap.get(currentIndex)) {
			Collections.swap(heap, currentIndex, parentIndex);
			currentIndex=parentIndex;
			parentIndex=parent(currentIndex);
		}
	}
	
	public int peek() {
		return heap.get(0);
	}
	
	public void insert(int value) {
		heap.add(value);
		shiftUp(heap.size()-1);
	}
	
	public int delete() {
		int deletedValue=peek();
		Collections.swap(heap, 0, heap.size()-1);
		heap.remove(heap.size()-1);
		shiftDown(0);
		return deletedValue;
	}
	
	public void display() {
		for(int i=0; i<heap.size(); i++) {
			System.out.println(heap.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> array = new ArrayList<>(Arrays.asList(5,1,8));
		MaxHeap heap=new MaxHeap(array);
		System.out.println("Initial values:");
		heap.display();
		boolean flagnew=false;
		
		while(flagnew==false) {
			System.out.println("****************************************");
			System.out.println("1.Insert\n2.Delete\n3.Display\n"
					+ "4.Peek\n5.Exit");
			System.out.println("Select an option: ");
			System.out.println("****************************************");
			int n=sc.nextInt();
			switch(n) {
				case 1: System.out.println("Enter data: ");
						int value=sc.nextInt();
						heap.insert(value);
						break;
				
				case 2: int val=heap.delete();
						System.out.println("Deleted Value: "+val);
						break;
				
				case 3: heap.display();
						break;
				
				case 4: int peek=heap.peek();
						System.out.println("MaxHeap Peek Value: "+peek);
						break;
				
				case 5: System.out.println("Thank You!");
				 		flagnew=true;
				 		break;
			}
		}
	}	
}