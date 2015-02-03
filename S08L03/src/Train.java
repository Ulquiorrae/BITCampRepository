
public class Train {
	public static void main(String[] args) {

		Truck[] alphabet = new Truck[26];
		Engine abc = new Engine("Alphabet");
		
		int alphaCharNumber = 65;
		
		// Loop for adding whole alphabet characters into our train
		for (int i = 0; i < 26; i++) {
			alphabet[i] = new Truck((char) alphaCharNumber);
			alphaCharNumber++;
		}
			
		abc.attach(alphabet[0]);	//Attaching first truck to engine
		
		// For loop for attaching
		for(int i=1; i<alphabet.length; i++){
			alphabet[i-1].attach(alphabet[i]);
		}
		
		
		sing(abc);
		
	
	}
	
	
	
	/**
	 * Sing method printing all characters in our traing
	 * @param abc
	 */
	public static void sing(Engine abc){
		Truck current = abc.getFirst();
		
		while(current != null){
			System.out.print(current.toString() +" ");
			current = current.getNext();
		}
	}
	
	
}