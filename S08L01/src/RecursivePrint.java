
public class RecursivePrint {

	public static void main(String[] args) {
		
		print(10);
		
	}
	
	private static void print(int n) {  
		int suma = 0;
		 System.out.println(n); 
        if (n > 1) {  
            print(n - 1);  
        }  
    }  
}

