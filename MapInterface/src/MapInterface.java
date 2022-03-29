import java.util.*;
public class MapInterface {
	public static void main(String[] args) {
		Map<String, Integer> obj=new TreeMap<>();
		
		obj.put("user1", 1);
		obj.put("user2", 2);
		obj.put("user3", 3);
		obj.put("user4", 4);
		obj.put("user5", 5);
		
		System.out.println(obj);
		
		obj.remove("user5");
		System.out.println(obj);
		
		obj.putIfAbsent("user66", 66);
		System.out.println(obj);
		obj.clear();
		System.out.println(obj.isEmpty());
		
	}
}
