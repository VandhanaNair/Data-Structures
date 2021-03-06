
public class SelectionSort {
	public static void selectionSort(int a[],int n)
    {
        for (int i = 0; i < n-1; i++)
        {
            int min = i;						//min -> index
            for (int j = i+1; j < n; j++) {
            	if (a[j] < a[min]) {
            		min = j;
            	}                	
            }                
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
	
	public static void display(int a[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = {5, 1, 11, -2, 19};
		int n = a.length;
		System.out.println("Unsorted array: ");
		display(a, n);
		
		selectionSort(a, n);
		
		System.out.println("Sorted array: ");
		display(a, n);
	}
}
