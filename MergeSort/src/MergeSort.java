
public class MergeSort
{
	public static void merge(int a[], int l, int m, int r)
	{
		int n1 = m - l + 1; //size of first and 2nd subarray
		int n2 = r - m;

		int temp1[] = new int[n1];
		int temp2[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			temp1[i] = a[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			temp2[j] = a[m + 1 + j];
		}

		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (temp1[i] <= temp2[j]) {
				a[k] = temp1[i];
				i++;
			}
			else {
				a[k] = temp2[j];
				j++;
			}
			k++;
		}
//copy rem elems
		while (i < n1) {
			a[k] = temp1[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = temp2[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int a[], int l, int r)
	{
		if (l < r) {
			int m =l+ (r-l)/2;

			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			
			merge(a, l, m, r);
		}
	}

	public static void display(int a[],int n)
	{
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		int a[] = { 12, 11, 13, 5, 6, 7 };
		int n = a.length;

		System.out.println("Unsorted array");
		display(a, n);

		mergeSort(a, 0, a.length - 1);

		System.out.println("\nSorted array");
		display(a, n);
	}
}