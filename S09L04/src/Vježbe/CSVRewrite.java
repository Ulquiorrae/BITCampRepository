package Vježbe;

public class CSVRewrite {
	private static String basePath = "./Database/";
	
	
	public static boolean savetoFile(String filename, String entry) {

		try{
		TextIO.writeFile(basePath + filename + ".csv");
		TextIO.putln(entry);
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
	
}
