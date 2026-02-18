package com.example.service.impl;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dto.DepartmentDto;
import com.example.entity.Department;
import com.example.exception.ResourceNotFoundException;
import com.example.mapper.DepartmentMapper;
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto createDepartment(DepartmentDto departmentDto) {
	Department department = DepartmentMapper.mapToDepartment(departmentDto);
	Department savedDepartment =	departmentRepository.save(department);
		return DepartmentMapper.mapToDepartmentDto(savedDepartment);
	}

	@Override
	public DepartmentDto getDepartmentById(Long departmentId) {
		Department department =		departmentRepository.findById(departmentId).orElseThrow(
			() -> new ResourceNotFoundException("Department is not exits with a given id: " +departmentId)
				);
		
		return DepartmentMapper.mapToDepartmentDto(department);
	}
	

	@Override
	public List<DepartmentDto> getAllDepartments() {
		List<Department> departments = departmentRepository.findAll();
		return departments.stream().map((department) -> DepartmentMapper.mapToDepartmentDto(department))
				.collect(Collectors.toList());
	}

	@Override
	public DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartment) {
		
	Department department =	departmentRepository.findById(departmentId).orElseThrow(
				() -> new ResourceNotFoundException("Department is not exists with a given id:" + departmentId)
				);
	department.setDepartmentName(updatedDepartment.getDepartmentDescription());
	department.setDepartmentDescription(updatedDepartment.getDepartmentDescription());
	
	   Department saveDepartment =   departmentRepository.save(department);
		return DepartmentMapper.mapToDepartmentDto(saveDepartment);
	}

	@Override
	public void deleteDepartment(Long departmentId) {
		departmentRepository.findById(departmentId).orElseThrow(
				()  -> new ResourceNotFoundException("Department is not exits with a given id: " + departmentId)
				);
		departmentRepository.deleteById(departmentId);
	}
	
	

}
