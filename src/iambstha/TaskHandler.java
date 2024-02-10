package iambstha;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract interface TaskHandler {

	public abstract TaskImporter taskImporter() throws IOException;

	public abstract TaskExporter taskExporter();

	default void convert(FileReader inputFile, String outputFileLocation, String outputFileName) throws IOException {

		TaskImporter taskImporter = new TaskImporter();
		List<Task> tasks = taskImporter.importTask(inputFile);

		
		TaskConverter taskConverter = new TaskConverter();
		String str = taskConverter.convertTask(tasks);

		TaskExporter taskExporter = new TaskExporter();
		taskExporter.exportTask(str, outputFileName, outputFileLocation);

	}

}
