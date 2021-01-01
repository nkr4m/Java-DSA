package String;

public class stringReverse3 {

	public static void main(String[] args) {
		String str = "Welcome to hotel california";
		String[] strArray = str.split(" ");
		
		for(int i=strArray.length-1; i>=0; i--) {
			char[] ch = strArray[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}

	}

}
