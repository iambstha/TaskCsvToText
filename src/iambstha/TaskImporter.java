package iambstha;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskImporter {

	public List<Task> importTask(FileReader file) throws IOException {
		List<Task> tasks = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(file)) {
		    br.lines()
		      .map(line -> line.split(","))
		      .forEach(parts -> {
		          Task task = new Task();
		          for (int i = 0; i < parts.length; i++) {
		              switch (i) {
		                  case 1:
		                      task.setProject(parts[i]);
		                      break;
		                  case 2:
		                      task.setModule(parts[i]);
		                      break;
		                  case 3:
		                      task.setIssue(parts[i]);
		                      break;
		                  case 4:
		                      task.setDuration(parts[i]);
		                      break;
		                  case 5:
		                      task.setDescription(parts[i]);
		                      break;
		                  case 6:
		                      task.setTechStack(parts[i]);
		                      break;
		                  default:
		                      break;
		              }
		          }
		          tasks.add(task);
		      });
		    tasks.remove(0);
		} catch (IOException e) {
		    e.printStackTrace();
		}


		return tasks;
	}

}
