import java.util.*;
public class Binary_Search {
	public static void binarySearch(int a[],int l,int r,int x) {
		int mid=(l+r)/2;
		while(l<=r) {
			if(a[mid]<x) {
				l=mid+1;
			}else if(a[mid]==x) {
				System.out.println("Element found at index: "+mid);
				break;
			}else {
				r=mid-1;
			}
			mid=(l+r)/2;
		}
		if(l>r){
			System.out.println("Element not found");
		}
	}
	
	public static void main(String[] args) {
		int a[]= {1,6,9,11,19,28,31,54,65,83};
		int x=100;
		int l=0,r=(a.length-1);
		binarySearch(a,l,r,x);
	}

}

