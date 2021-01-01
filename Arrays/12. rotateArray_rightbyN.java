class array_rotate_right{
	public void array_rotate_rightby1(int arr[], int size){
		int temp = arr[size-1];
		for(int i=size-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public void array_rotate_rightbyN(int arr[], int size, int x) {
		for(int i=0; i<x; i++) {
			
			array_rotate_rightby1(arr, size);
		}
	}
	
	public void print_array(int arr[], int size) {
		for(int k: arr) {
			System.out.print(k + " ");
		}
	}
}


public class rotateArray_rightbyN {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int size = arr.length;
		int x = 3;
		
		array_rotate_right rotate = new array_rotate_right();
		rotate.array_rotate_rightbyN(arr, size, x);
		rotate.print_array(arr, size);
		
		

	}

}
