package assignments_io;

import java.io.File;

/**
 * accept the complete path of a file from the user and display whether the file exist or not.
 * @author tkhandag
 *
 */
public class FileExistApplication 
{
	/**
	 * method is File Exist
	 * @param file
	 * @return
	 */
	
	public boolean isFileExist(File file)
	{
		boolean output = file.exists();
		return output;
	}
	
}
