class smallest_array{
	public int smallest_ele(int arr[], int size) {
		
		int min = arr[0];
		for(int i=1; i<size; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		
		return min;
		
	}
}


public class smallest_inArray {

	public static void main(String[] args) {
		int arr[] = {12,2,3,4,5};
		
		smallest_array se = new smallest_array();
		int ans = se.smallest_ele(arr, arr.length);
		System.out.println(ans);
	}

}
