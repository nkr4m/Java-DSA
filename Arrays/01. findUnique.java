package arrays;

public class findUnique {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,6,3,6,2};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				
				if(i!=j) {
					if(arr[i] == arr[j]) {
						break;
					}
				}
				if(j==arr.length-1) {
					System.out.println(arr[i]);
				}
				
			}
		}

	}

}
