package arrays;

public class sumPair {

	public static void main(String[] args) {
		int arr[] = {1,3,6,2,5,4,3,2,4};
		int x = 7;
		
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == x && i!=j) {
					count = count + 1;
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		System.out.println(count);
	}

}
