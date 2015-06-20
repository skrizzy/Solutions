import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Please enter a sentence to be reversed: ");
		String sentence = new Scanner(System.in).nextLine();
		String reversed = "";
		ReverseString rs = new ReverseString();
		ArrayList<String> words = rs.getWords(sentence);
		for (int dracula = words.size() - 1; dracula >= 0; dracula--) {
			reversed += words.get(dracula) + " ";
		}
		System.out.println(reversed);
	}

	public ArrayList<String> getWords(String sentence) {
		int nextSpace = 0;
		ArrayList<String> words= new ArrayList<>();

		while(true) {
			String word = "";
			nextSpace = sentence.indexOf(" ");
			if (nextSpace == -1) {
				word = sentence;
				words.add(word);
				break;
			} else
				word = sentence.substring(0, nextSpace);
			words.add(word);
			sentence = sentence.substring(nextSpace + 1);
		}

		return words;
	}
}
