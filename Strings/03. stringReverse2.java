package String;

public class stringReverse2 {

	public static void main(String[] args) {
		
		String str = "welcome to hotel california";
		String[] strArray = str.split(" ");
		
		for(int i=0; i<strArray.length; i++) {
			char[] ch = strArray[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		

	}

}
