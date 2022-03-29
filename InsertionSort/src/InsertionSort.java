
public class InsertionSort {
	public static void insertionSort(int a[],int n)
    {
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
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
		
		insertionSort(a, n);
		
		System.out.println("Sorted array: ");
		display(a, n);
	}
}
