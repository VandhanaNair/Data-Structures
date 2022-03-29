import java.util.*;
public class Exponential_Search {

	public static int exponentialSearch(int a[],int n,int x) {
		if(a[0]==x) {
			return 0;
		}
		
		int i=1;
		while(i<n && a[i]<=x) {
			i=i*2;
		}
		return Arrays.binarySearch(a,i/2,Math.min(i, n-1),x);
	}
	
	public static void main(String[] args) {
		int a[]={1,6,9,11,19,28,31,54,65,83};
		int x=1;
		int result=exponentialSearch(a,a.length,x);
		if(result<0){
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index: "+result);
		}
	}
}

