import java.util.*;
public class Collection_List {
	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<>(); //ArrayList
		
		obj.add(10);
		obj.add(20);
		obj.add(1, 15);
		System.out.println(obj);
		
		
		List<Integer> newobj=new LinkedList<>();	//LinkedList

		newobj.add(100);
		newobj.add(200);
		System.out.println(newobj);

		obj.addAll(newobj);
		System.out.println(obj);	//Both lists are combined
		

		//Iterator<Integer> it=obj.iterator();	//Iterator Interface
		//
		//while(it.hasNext()) {
		//	System.out.println(it.next());
		//}


		System.out.println(obj.contains(300));	//contains() function
		
		
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));		//size() function
		}

		if(obj.contains(1000)) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		
		System.out.println(obj.get(4));		//get() function

		System.out.println(obj.remove(1));		//remove() function
		System.out.println(obj);

		System.out.println(obj.remove(Integer.valueOf(200)));
		System.out.println(obj);

		//obj.clear();		//clear() function
		//obj.set(2, 30);	//set() function
		
		/*		
		//*****************Stack***************
	
	
		Stack<String> sobj=new Stack<>();
		
		sobj.push("abc");
		sobj.push("def");
		sobj.push("ghi");
		
		System.out.println(sobj);
		
		System.out.println(sobj.peek());
		
		sobj.pop();		
		System.out.println(sobj);
		sobj.pop();		
		System.out.println(obj);
		
		
		//*****************Stack***************
		*/
	}
	
}
























