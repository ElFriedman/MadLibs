import java.io.BufferedReader;

public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
		
		System.out.println("What is the name of the file containing the MadLibs story?");
		String fileName = scanner.next();
		BufferedReader br = new BufferedReader(fileName);
		char c;
		while(br.ready()) { 
			c = br.read()
			if (c == '<') {
				c = br.read();
				c = "";
				String s = "";
				while (c != '>') {
					s += c;
					c = br.read();
				}
				
			}
		}
		
		
	}

}
