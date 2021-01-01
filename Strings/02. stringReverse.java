package String;

public class stringReverse {

	public static void main(String[] args) {
		String str = "Welcome to the hotel california";
		String[] strArray = str.split(" ");
		
		for(int i=strArray.length-1; i>=0; i--) {
			System.out.print(strArray[i] + " ");
		}

	}

}
