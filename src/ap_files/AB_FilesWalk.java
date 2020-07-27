package ap_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;

public class AB_FilesWalk {
	public static void main(String[] args) throws IOException {
		fileWalkFilter();

		fileRead();

		fileWrite();
	}

	public static void fileWalkFilter() throws IOException {
		Path currentDirPath = Path.of(".");

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> {
			return path.toString().endsWith(".txt");
		};

		Files.find(currentDirPath, 4, matcher).forEach(System.out::println);
		;
	}

	@SuppressWarnings("unused")
	private static void filesWalk() throws IOException {
		Path currentDirPath = Path.of(".");

		Files.walk(currentDirPath, 4).forEach(System.out::println);
	}

	public static void fileRead() throws IOException {
		Path filePath = Path.of("./resources/data.txt");

		List<String> lines = Files.readAllLines(filePath);

		lines.forEach(System.out::println);
	}

	public static void fileWrite() throws IOException {
		Path filePath = Path.of("./resources/dataWrite.txt");

		List<String> lines = List.of("asd", "dasasas", "dsadsa", "dsadsa");

		Files.write(filePath, lines);
	}
}
