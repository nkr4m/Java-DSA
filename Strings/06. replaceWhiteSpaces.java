package String;

public class replaceWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "Welcome to hotel california";
		String ans = str.replaceAll("\\s", "");
		
		System.out.println(ans);

	}

}
