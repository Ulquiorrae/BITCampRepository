import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CSVBuilder {

	private static String basePath = "." + File.separator;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static InputStream is;
	private static OutputStream os;
	private static String currentOpen = null;

	public static <T extends CSVInterface> void saveObject(String fileName, T objectToSave) throws IOException {

		if (fileName.equals(currentOpen))
		{
			os.write(objectToSave.objectToCSV().getBytes());
		}
		else
		{
			fos = new FileOutputStream(basePath + fileName + ".csv");
			os = new DataOutputStream(fos);
			currentOpen = fileName;
			os.write(objectToSave.objectToCSV().getBytes());
			os.write("\n".getBytes());
		}
		os.flush();
		System.out.println(objectToSave.objectToCSV());
	}

	public static <T extends CSVInterface> T findObject(String[] array) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length - 1; i++)
		{
			sb.append(array[i]).append(", ");
		}
		sb.append(array[array.length - 1]);
		BufferedReader bis = new BufferedReader(new InputStreamReader(fis));
		String line = "";

		try {

			String search = sb.toString();

			while ((line = bis.readLine()) != null) {
				if (line.equals(search))
				{
					@SuppressWarnings("unchecked")
					T object = (T) new Object();
					object.csvToObject(line);
					return object;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
}