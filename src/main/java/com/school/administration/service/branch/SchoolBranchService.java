package com.school.administration.service.branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.administration.model.SchoolBranch;
import com.school.administration.repository.branch.SchoolBranchRepository;

@Service
public class SchoolBranchService {

	@Autowired
	private SchoolBranchRepository schoolBranchRepository;
	
	public void saveBranch(SchoolBranch schoolBranch) {
		schoolBranchRepository.save(schoolBranch);
	}
}
