package iambstha;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskExporter {

	public void exportTask(String str, String outputFileName, String outputFileLocation) {

		Path path = Paths.get(outputFileLocation + outputFileName);

		try {
			Files.writeString(path, str, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File Written");

	}

}
