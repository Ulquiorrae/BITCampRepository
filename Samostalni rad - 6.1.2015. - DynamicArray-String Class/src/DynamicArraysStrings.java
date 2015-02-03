public class DynamicArraysStrings {

	private String [] array;
	private int counter;
	
	private final static int INITIAL_SIZE = 2;
	
	
	public DynamicArraysStrings(){
		this(INITIAL_SIZE);
	}
	
	public DynamicArraysStrings (int size){
		
		this.array = new String[size];
		this.counter=0;
	}
	
	
	/**
	 * This method adds a new element to an array of strings,
	 * but first it checks if the adding is valid. 
	 * @param string
	 */
	public void add(String value){
		
		if(this.array.length == counter)  
			resize();					  
		
		this.array[counter] = value; 	 
		counter++;						
		
		
	}

	/**
	 * Void method that resizes an array of strings(doubles it).
	 */
	private void resize() {
		
		String [] temp = this.array;					
		this.array = new String[temp.length*2];			
		
		for(int i=0; i<counter; i++)						
			this.array[i] = temp[i];
		
	}

	/**
	 * This method removes an element of an array of strings in this class.
	 * @param offset is index of element we want to remove.
	 */
	public void remove (int index){
		
		if(index < 0 || index > counter)														
			throw new  ArrayIndexOutOfBoundsException("Greska u remove metodi");
		
		for(int i=index; i<counter-1;i++){														
			array[i] = array[i+1];
		}
		counter--;																				
						
	}
	
	/**
	 * This methods sets the value of an element with index we forward to it. 
	 * @param index	- index of an element in an array
	 * @param value		
	 */
	public void setValue(int index, String value){
		
		if(index <0 || index > counter)
			throw new ArrayIndexOutOfBoundsException("## ERROR!! ##");
		
		this.array[index] = value;
		
	}
	
	
	public String [] toArray(){
		
		String[] toArray = new String [counter];			
		
		for(int i=0; i<counter;i++)							
			toArray[i] = this.array[i];
		
		return toArray;
		
	}
	
	/**
	 * Method that returns the value of an element on given index.
	 * @param index	- index of an element in an array
	 * @return String		
	 */
	public String getAt (int index){
		if(index <0 || index > counter)
			throw new ArrayIndexOutOfBoundsException("Greska u setValue");
		
		return this.array[index];
	}
	

	
	
	
}