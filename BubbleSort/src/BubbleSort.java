
public class BubbleSort {
	
	public static void bubbleSort(int a[], int n)
	{
		boolean flag;
		for (int i = 0; i < n - 1; i++)
		{
			flag = false;
			for (int j = 0; j < n - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
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
		
		bubbleSort(a, n);
		
		System.out.println("Sorted array: ");
		display(a, n);
	}

}
