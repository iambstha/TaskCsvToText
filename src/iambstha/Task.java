package iambstha;

import java.io.File;

public class Task {
	
	private Long id;
	
	private String project;
	
	private String module;
	
	private String issue;
	
	private String duration;
	
	private String description;
	
	private String techStack;
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getProject() {
		return project;
	}



	public void setProject(String project) {
		this.project = project;
	}



	public String getModule() {
		return module;
	}



	public void setModule(String module) {
		this.module = module;
	}



	public String getIssue() {
		return issue;
	}



	public void setIssue(String issue) {
		this.issue = issue;
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getTechStack() {
		return techStack;
	}



	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}



	public File toTXT(File csvFile) {
		return null;
	}
	
}
