
public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		ArrayList<String> nouns = new ArrayList<String>;
		BufferedReader br = new BufferedReader(new FileReader("nouns.txt"));
		while(br.ready())
		{
			ArrayList.add(br.readLine());
		}
		br.close();
		
		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		FileReader fr=new FileReader("verbs.txt");
		BufferedReader br=new BufferedReader(fr);
		Arraylist<Stirng> listString;
		while((i=br.read())!=-1){
			String next=new String("");
			while(!(char)i.equals(" ")){
				next+=char(i);
			}
			listString.add(next);
		}f
		br.close();
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

	}

}
