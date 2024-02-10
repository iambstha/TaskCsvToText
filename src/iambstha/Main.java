package iambstha;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

		Main m = new Main();

		m.convert(new FileReader(new File("D:/Task Generator/task.csv")), "D:/Task Generator/", "task.txt");

	}

}
