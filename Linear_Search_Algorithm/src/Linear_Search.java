import java.util.*;
public class Linear_Search {
	
	public static int linearSearch(int a[], int x) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]= {5,3,6,1,8,4};
		int x=55;
		int result=linearSearch(a,x);
		if(result<0) {
			System.out.println("Value does not exists.");
		}
		else {
			System.out.println("Value exists at pos: "+result);
		}
	}
}
