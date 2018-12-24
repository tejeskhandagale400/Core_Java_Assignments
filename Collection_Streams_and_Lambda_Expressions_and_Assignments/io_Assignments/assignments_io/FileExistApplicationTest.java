package assignments_io;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

/**
 * class File Exist Application Test 
 * @author tkhandag
 *
 */
public class FileExistApplicationTest 
{
	
	private Logger logger = Logger.getLogger(FileExistApplicationTest.class.getName());

	@Test
	public void testFileExist() 
	{			
		BasicConfigurator.configure();
		FileExistApplication fileObject = new FileExistApplication();
		File file = new File("C:/work/Java/New Text Document.txt");
		boolean expected = fileObject.isFileExist(file);
		
		assertTrue(expected);
	}

	@Test
	public void testFileDoesNotExist() 
	{
		FileExistApplication fileObject = new FileExistApplication();
		File file = new File("C:/work/Java/New Text Document1.txt");
		boolean expected = fileObject.isFileExist(file);
		assertFalse(expected);
	}

}
