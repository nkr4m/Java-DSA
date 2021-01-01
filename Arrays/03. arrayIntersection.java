package arrays;

public class arrayIntersection {

	public static void main(String[] args) {
		
		int arr1[] = {2,6,1,2};
		int arr2[] = {1,2,3,4,2};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					arr2[j] = -11111;
					break;
				}
			}
		}

	}

}
