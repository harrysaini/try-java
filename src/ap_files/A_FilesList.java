package ap_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class A_FilesList {
	public static void main(String[] args) {
		Path currentDirPath = Path.of(".");

		try {
			Files.list(currentDirPath).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
