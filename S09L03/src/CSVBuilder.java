
public class CSVBuilder {

	private String res = null;
	
	
	/**
	 * This method adds a String to a CSV file.
	 * @param val - String
	 * @return this - returns itself
	 */
	public CSVBuilder append(String val) {
		if (res != null) {
			res = res + "," + val + "";
		} else {
			res = val;
		}
		return this;
	}

	
	public CSVBuilder append(Object obj) {
		return append(obj.toString());
	}
	

	/**
	 * This method converts CSV type to String.
	 */
	public String toString() {
		if (res != null) {
			return res;
		} else {
			return "";
		}
	}

}
