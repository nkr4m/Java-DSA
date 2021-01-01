
public class search_forElement {

	public static void main(String[] args) {
		int arr[] = {11,22,32,41,52};
		
		int x = 41;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == x) {
				System.out.println("the element is in the index: " + i);
			}
		}

	}

}
