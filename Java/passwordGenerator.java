import java.util.Random;

public class passwordGenerator {

	public static String generateRandomPassword(int len) {
		
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String char1 = "!";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len - 1; i++) {
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		sb.append(char1);
		return sb.toString();
	}
	public static void main(String[] args) {
		
	System.out.println(generateRandomPassword(7));
	}
}
