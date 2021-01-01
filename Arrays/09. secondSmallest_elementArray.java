import java.util.*;

class second_smallest{
	public int second_ele(int arr[], int size) {
		
		int min_1 = arr[0];
		for(int i=1; i<size; i++) {
			if(arr[i] < min_1) {
				min_1 = arr[i];
			}
		}
		
		
		for(int i=0; i<size; i++) {
			if(arr[i] == min_1) {
				arr[i] = 99999;
			}
		}
		
		int min_2 = arr[0];
		for(int i=1; i<size; i++) {
			if(min_2 > arr[i]) {
				min_2 = arr[i];
			}
		}
		
		return min_2;
		
	}
}


public class secondSmallest_elementArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		second_smallest sl = new second_smallest();
		int ans = sl.second_ele(arr, arr.length);
		System.out.println(ans);

	}

}
