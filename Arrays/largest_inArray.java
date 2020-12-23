class largest_array{
	public int largest_ele(int arr[], int size) {
		
		int max = arr[0];
		for(int i=1; i<size; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}


public class largest_inArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,42,5};
		largest_array le = new largest_array();
		int ans = le.largest_ele(arr, arr.length);
		System.out.println(ans);
	}

}
