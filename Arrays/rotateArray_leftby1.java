class array_rotate{
	public void rotate_by1(int arr[], int size) {
		
		int temp = arr[0];
		for(int i=0; i<size-1; i++) {
			arr[i] = arr[i+1];
			
		}
		arr[size-1] = temp;
	}
	
	public void print_array(int arr[], int size) {
		
		for(int k:arr) {
			System.out.print(k + " ");
		}
	}
	
}


public class rotateArray_leftby1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int size = arr.length;
		
		System.out.println("original array");
		for(int k:arr) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		array_rotate rotate = new array_rotate();
		rotate.rotate_by1(arr, size);
		System.out.println("rotated array");
		rotate.print_array(arr, size);

	}

}
