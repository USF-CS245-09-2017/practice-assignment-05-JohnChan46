public class QuickSort implements SortingAlgorithm{

	public QuickSort(){
	}



//@Override

	public void sort(int [] a){

        quickSort(a, 0, a.length - 1);
    }






	 void quickSort(int[] a, int min, int max) {
		if (min >= max) {
			return;  // base case
		}
		
		int pivot = a[min]; //set a pivot value
		swap(a, min, max); // swap it to the end
		int i = min;
		int j = max - 1;

		while (i <= j) {
			while (i <= j && a[i] < pivot) {
				i++;
			}
			while (i <= j && a[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}//while
				
		swap(a, max, i); // swap pivot to middle
		quickSort(a, min, i - 1);
		quickSort(a, i + 1, max);
	}//void


	void swap(int[] a, int i, int j) { //swap element 
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;

	}//void


}

