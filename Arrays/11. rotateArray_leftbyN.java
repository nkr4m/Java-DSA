class rotate_arraybyN{
	public void rotate_by_1(int arr[], int size) {
		
		int temp = arr[0];
		for(int i=0; i<size-1; i++) {
			arr[i] = arr[i+1];
			
		}
		arr[size-1] = temp;
	}
	
	public void rotate_by_n(int arr[], int size, int x) {
		for(int i=0; i<x; i++) {
			rotate_by_1(arr, size);
		}
	}
	
	public void print_array(int arr[], int size) {
		for(int k:arr) {
			System.out.print(k + " ");
		}
	}
}


public class rotateArray_leftbyN {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int size = arr.length;
		int x = 3;
		System.out.println("original array:");
		for(int k:arr) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("rotated array:");
		rotate_arraybyN rotate = new rotate_arraybyN();
		rotate.rotate_by_n(arr, size, x);
		rotate.print_array(arr, size);

	}

}
