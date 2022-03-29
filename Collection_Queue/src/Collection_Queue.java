import java.util.*;
public class Collection_Queue {
	public static void main(String[] args) {
		
		Queue<Integer> obj=new LinkedList<>();
		
		/*
		 //PriorityQueue
		  
		  Queue<Integer> obj=new PriorityQueue<>(Comparator.reverseOrder());
		  
		 */
		
		obj.offer(10);
		obj.offer(20);
		obj.offer(30);
		obj.add(40);
		
		System.out.println("Queue: "+obj);
		
		System.out.println(obj.peek());
		System.out.println(obj.element());
		
		obj.remove();
		System.out.println("Queue after remove(): "+obj);
		
		obj.poll();
		System.out.println("Queue after poll(): "+obj);
		
		
		/*
		 //Deque
		  
		Deque<Integer> obj=new ArrayDeque<>();

		obj.offer(60);
		obj.offer(10);
		obj.offerFirst(20);
		obj.offerFirst(40);
		obj.offerLast(50);
		obj.offerLast(30);
		
		System.out.println("Queue: "+obj);
		
		System.out.println(obj.peek());
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
			
		obj.poll();
		System.out.println("Queue after poll(): "+obj);
		obj.pollFirst();
		System.out.println("Queue after pollFirst(): "+obj);
		obj.pollLast();
		System.out.println("Queue after pollLast(): "+obj);
		
		*/
		
	}
}
