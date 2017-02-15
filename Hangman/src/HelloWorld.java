import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		int numOfPlayers;
		int numOfChar;
		char inputLetter;
		String Word;
		System.out.println("Welcome to a game of hangman"+"\n"+"Is this a two player game or one? (Enter number of players)");
		
		Scanner input = new Scanner(System.in);
		numOfPlayers = input.nextInt();
		//Two player Game
		if(numOfPlayers==2){
			System.out.println("Player 1 please enter a word");
			Word = input.next().toLowerCase();
			numOfChar = Word.length();
			char[] hangman = new char[Word.length()];
			char[] blank = new char[Word.length()];
			for(int j = 0; j < numOfChar; j++){
				hangman[j] = new Character(Word.charAt(j));
				blank[j] = '_';

				//Checks if char array is correct
				//System.out.println(hangman[j]);
			}
			//Print initial blank word size
				System.out.println(blank);
				//Check to see if there is still an empty box 
		for(int l = 0; l < numOfChar; l++){
			if(blank[l] == '_'){
			//If true allow user to enter a letter
			System.out.println("Enter a letter");
			inputLetter = input.next().charAt(0);
			//Iterate through char array to see if letter is inside
			for(int k = 0; k < numOfChar; k++){
				//Character.toLowerCase(sentence.charAt(i))==
				if(Character.toLowerCase(inputLetter)==hangman[k]){
					blank[k] = inputLetter;
				}
				
					
			}
			System.out.println(blank);
			}

			
		
	}
		}//End of 2 player Game
		//1 player game vs AI
		else if(numOfPlayers ==1){
			System.out.println("This mode is still under development");
			System.exit(1);
		}//End of 1 player game
		else{
			System.out.println("Incorrect Response. Try Again");
			return;
		}
		
	
	
	

	}}
