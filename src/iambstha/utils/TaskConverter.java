package iambstha.utils;

import java.util.List;

import iambstha.Task;

public class TaskConverter {

	public String convertTask(List<Task> tasks) {

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < tasks.size(); i++) {
			Task task = tasks.get(i);
			str.append("Task ").append(i + 1).append("\n");
			str.append("Project: ").append(task.getProject()).append("\n");
			if (task.getProject() != null && !task.getProject().isEmpty()) {
				str.append("Module: ").append(task.getModule()).append("\n");
			}
			if (task.getIssue() != null && !task.getIssue().isEmpty()) {
				str.append("Issue: ").append(task.getIssue()).append("\n");
			}
			if (task.getDuration() != null && !task.getDuration().isEmpty()) {
				str.append("Duration: ").append(task.getDuration()).append(" Hour\n");
			}
			if (task.getDescription() != null && !task.getDescription().isEmpty()) {
				str.append("Description: ").append(task.getDescription()).append("\n");
			}
			if (task.getTechStack() != null && !task.getTechStack().isEmpty()) {
				str.append("Tech Stack: ").append(task.getTechStack()).append("\n");
			}
			str.append("\n");
		}

		return str.toString();

	}

}
