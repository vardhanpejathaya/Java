package I_FileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileOperations {

	public static void main(String args[]) {

		String filelocation = "d://Wipro//STS_WORKSPACE//Java8//sample.txt";

		try {
			Stream<String> fileData = Files.lines(Paths.get(filelocation))
					.filter(s -> !s.startsWith("line1"))
					.map(s -> s.toUpperCase());

			fileData.forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
