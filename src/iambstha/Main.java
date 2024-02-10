package iambstha;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.Timestamp;
import java.time.Instant;
import java.util.Date;

import iambstha.utils.TaskExporter;
import iambstha.utils.TaskImporter;

public class Main implements TaskHandler {

	@Override
	public TaskImporter taskImporter() throws IOException {

		return new TaskImporter();
	}

	@Override
	public TaskExporter taskExporter() {
		return new TaskExporter();
	}

	public static void main(String[] args) throws IOException {
		
		Date ts = new Date();
		File file = new File("src/task.csv");
		FileReader fileReader = new FileReader(file);
		String outputFilePath = "src/task-records/";
		ts.toInstant();
		String outputFileName = ts.toInstant().toString().substring(0,10) + "_task.txt";

		Main main = new Main();
		main.convert(fileReader, outputFilePath, outputFileName);

	}

}
