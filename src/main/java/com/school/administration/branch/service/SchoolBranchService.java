package com.school.administration.branch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.administration.branch.repository.SchoolBranchRepository;
import com.school.administration.model.SchoolBranch;

@Service
public class SchoolBranchService {

	@Autowired
	private SchoolBranchRepository schoolBranchRepository;
	
	public void saveBranch(SchoolBranch schoolBranch) {
		schoolBranchRepository.save(schoolBranch);
	}
}
