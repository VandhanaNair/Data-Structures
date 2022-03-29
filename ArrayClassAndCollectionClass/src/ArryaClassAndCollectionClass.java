import java.util.*;
public class ArryaClassAndCollectionClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[] =new int[5];
		System.out.println("Inserting A array: ");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After Sorting");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		int n=Arrays.binarySearch(a, 2);
		System.out.println("Binary search value:"+n);
		
		Arrays.fill(a,22);
		System.out.println("After filling");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Inserting B array: ");
		int b[] =new int[5];
		for(int i=0;i<5;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("If A and B are equal"+Arrays.equals(a, b));
		
		
		/*
		  //Collections class
		   
		   List<Integer> obj=new ArrayList<>();
		obj.add(1);
		obj.add(5);
		obj.add(3);
		obj.add(9);
		obj.add(7);
		obj.add(3);
		
		System.out.println(obj);
		
		int min=Collections.min(obj);
		int max=Collections.max(obj);
		System.out.println("Min value:"+min+"\nMax value"+max);
		int freq=Collections.frequency(obj, 7);
		System.out.println("Freq: "+freq);
		Collections.sort(obj, Comparator.reverseOrder());
		System.out.println(obj);
		   
		 */
		
		
		
	}
}






