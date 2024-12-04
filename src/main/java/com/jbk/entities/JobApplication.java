package com.jbk.entities;


import com.jbk.enums.ApplicationStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_application")
public class JobApplication {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	private long id;
	
	@Column(name = "student_id", nullable = false)
	private long studentId;
	
	@Column(name = "job_posting_id", nullable = false)
	private long jobPostingId;
	
	@Column(name = "status",nullable = false)
	private String status = ApplicationStatus.APPLIED.getValue();
}
