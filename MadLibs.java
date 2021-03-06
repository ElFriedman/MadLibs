
import java.util.*;
import java.io.BufferedReader;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		ArrayList<String> nouns = new ArrayList<String>(); //creates a nouns ArrayList
		ArrayList<String> verbs = new ArrayList<String>();
		ArrayList<String> adjectives = new ArrayList<String>();
		ArrayList<String> adverbs = new ArrayList<String>();
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		BufferedReader br = new BufferedReader(new FileReader("adjectives.txt"));
 		while (br.ready()) {
 			adjectives.add(br.readLine())
 		}
 		br.close();
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.
 		BufferedReader br = new BufferedReader(new FileReader("adverbs.txt"));
 		while(br.ready()) {
 			adverbs.add(br.readLine());
 		}
 		br.close();
		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
		
		System.out.println("What is the name of the file containing the MadLibs story?");
		String fileName = scanner.next();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		char c;
		while(br.ready()) { 
			c = br.read();
			if (c == '<') {
				c = br.read();
				c = "";
				String s = "";
				while (c != '>') {
					s += c;
					c = br.read();
				}
				if (s == "NOUN") {
					System.out.print(nouns.get((int)(Math.random() * nouns.size())));
				}
				if (s == "VERB") {
					System.out.print(verbs.get((int)(Math.random() * verbs.size())));
				}
				if (s == "ADJECTIVES") {
					System.out.print(adjective.get((int)(Math.random() * adjective.size())));
				}
				if (s == "ADVERBS") {
					System.out.print(adverbs.get((int)(Math.random() * adverbs.size())));
				}
				else {
					System.out.print("42");
				}
				c = br.read();
			} else {
				System.out.print(c);
			}
		}
		br.close();
		
		
	}

}
