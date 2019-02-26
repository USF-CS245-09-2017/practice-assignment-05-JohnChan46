public class MergeSort implements SortingAlgorithm{

	public MergeSort(){
	}



//@Override

	public void sort(int [] a){
		if(a.length>1){
			int mid = a.length/2;
			int[] left = new int[mid];
			int[] right = new int[a.length-mid];


		for(int i=0; i < mid; i++){ //copy left
			left[i] = a[i];
		}
		for(int i=mid; i<a.length; i++){ //copy right
			right[i-mid] = a[i];
		}


			sort(left);
			sort(right);

			merge(left, right, a);
		}//if
	}//void





	void merge(int[] left,int[] right,int[] a){
		int left_index = 0;
		int right_index = 0;
		int target_index = 0;

		while(left_index < left.length && right_index < right.length){
			if(left[left_index] <= right[right_index]){
				a[target_index++] =  left[left_index++];
			}//if
			else{
				a[target_index++] =  right[right_index++];
			}//else
		}

		while(left_index < left.length){
			a[target_index++] =  left[left_index++];
		}//while

		while(right_index < right.length){
			a[target_index++] =  right[right_index++];
		}//while



	}//void

}//public






