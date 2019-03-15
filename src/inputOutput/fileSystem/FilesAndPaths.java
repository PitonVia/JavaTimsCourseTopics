package inputOutput.fileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class FilesAndPaths {

	public static void main(String[] args) {
		
		Path path = FileSystems.getDefault().getPath("src/inputOutput/fileSystem/PackageFile.txt");
		
		// calls the method to print all  file's content
		printFile(path); 
		
		System.out.println();
		
		// Print to see the actual path - good for troubleshooting! 
		System.out.println(path.toString());
		System.out.println();
		
		// Note that "." refers to the current directory in Win and Linux command prompts
		System.out.println(Paths.get(".").toAbsolutePath());
		
		// Can also use ".." to move up to parent directories. In this case, the path goes 
		// 2 directories up from the project's buildpath and then locates a text file
		Path filePath = Paths.get("../../JavaPrograms/OutThere.txt");
		
		// Can check if a path exists using Files.exists() method
		System.out.println("Path exists? " + Files.exists(filePath));
		
		// Copying a file (can also copy a directory)
		try {
			Path sourceFile = FileSystems.getDefault().getPath("src", "inputOutput", "fileSystem", "PackageFile.txt");
//			System.out.println(sourceFile.toString());
//			System.out.println("Exists: " + Files.exists(path));
			Path destFile = FileSystems.getDefault().getPath("src", "inputOutput", "fileSystem", "PackageFileCopy.txt");
			
			// Note - exception will be generated if we try to overwrite the file with the same name 
			// unless we add the StandardCopyOption.REPLACE_EXISTING
			Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();

		// Retrieving all basic files attributes for a file
		try {
			BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Size = " + attrs.size());
			System.out.println("Last modified = " + attrs.lastModifiedTime());
			System.out.println("Created = " + attrs.creationTime());
			System.out.println("Is directory = " + attrs.isDirectory());
			System.out.println("Is regular file = " + attrs.isRegularFile());

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		// When dealing with paths on different OS, file separators are different on Win "\" vs on
		// Mac or Linux "/". Hence, we may have to use the proper file separators for the code to work.		
		String separator = File.separator;
		System.out.println(separator);
		separator = FileSystems.getDefault().getSeparator();
		System.out.println(separator);
		
//		Path filePath2 = Paths.get("../../JavaPrograms/OutThere.txt");
		Path filePath2 = Paths.get(".." + File.separator +".." + File.separator + "JavaPrograms" + File.separator + "OutThere.txt");
		System.out.println("filePath2 exists? " + Files.exists(filePath2));
	}

	// Reads lines from a file specified by Path and prints them to the console 
	private static void printFile(Path path) {
		
		// try with resources
		try (BufferedReader fileReader = Files.newBufferedReader(path)) {
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
