import java.util.*;

class second_largest{
	public int second_ele(int arr[], int size) {
		int max = Collections.max(Arrays.asList(size));
		
		for(int i=0; i<size; i++) {
			if(arr[i] == max) {
				arr[i] = -1;
			}
		}
		
		int max_2 = arr[0];
		
		for(int i=1; i<size; i++) {
			if(max_2 < arr[i]) {
				max_2 = arr[i];
			}
		}
		
		return max_2;
	}
}


public class secondLargest_elementArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		second_largest sl = new second_largest();
		int ans = sl.second_ele(arr, arr.length);
		System.out.println(ans);

	}

}
