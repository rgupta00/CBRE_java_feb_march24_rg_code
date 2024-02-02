package com.session4.ex7.queue_examples;

public class JobWork{
	private int id;
	private String jobWork;
	private int priority;
	
	public JobWork(int id, String jobWork, int priority) {
		this.id = id;
		this.jobWork = jobWork;
		this.priority = priority;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JobWork [id=").append(id)
		.append(", jobWork=").append(jobWork).append(", priority=")
				.append(priority).append("]");
		return builder.toString();
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobWork() {
		return jobWork;
	}

	public void setJobWork(String jobWork) {
		this.jobWork = jobWork;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}


	
}
