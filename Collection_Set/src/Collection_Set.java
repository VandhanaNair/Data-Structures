import java.util.*;
public class Collection_Set {
	public static void main(String[] args) {
		Set<Integer> obj=new HashSet<>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println("The HashSet is: "+obj);
		
		obj.remove(50);
		System.out.println("The HashSet after deleting 50 is: "+obj);
		
		System.out.println("The HashSet contains value or not?: "+obj.contains(50));
		
		//obj.clear();
		
		System.out.println("The HashSet is empty or not? : "+obj.isEmpty());
		
		System.out.println("The HashSet size is: "+obj.size());
		
		/*     TreeSet    */
		
		TreeSet<Integer> treeobj=new TreeSet<>(obj);
		System.out.println("The TreeSet is: "+treeobj);
		System.out.println("The first value of TreeSet is:"+treeobj.first());
		System.out.println("The last value of TreeSet is:"+treeobj.last());
		
		/*   //LinkedHashSet
		
		LinkedHashSet<Integer> linkedobj=new LinkedHashSet<>();
		linkedobj.add(10);
		linkedobj.add(20);
		linkedobj.add(100);
		linkedobj.add(40);
		linkedobj.add(50);
		System.out.println("The LinkedHashSet is: "+linkedobj);
		
		*/
		
	}
}



