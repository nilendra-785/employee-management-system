package com.example.service;

import java.util.List;

import com.example.dto.DepartmentDto;

public interface DepartmentService {

	public DepartmentDto createDepartment(DepartmentDto departmentDto);
	
	public DepartmentDto getDepartmentById(Long departmentId);
	
	public List<DepartmentDto> getAllDepartments();
	
	public DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartment);
	
	void deleteDepartment(Long departmentId);
}
